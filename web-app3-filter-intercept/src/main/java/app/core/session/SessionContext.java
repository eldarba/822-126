package app.core.session;

import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SessionContext {

	@Autowired
	private ApplicationContext ctx; // to get session beans
	private Map<String, Session> sessionsMap = new ConcurrentHashMap<String, Session>();
	private Timer timer = new Timer();
	@Value("${session.remove.expired.period:20}")
	private int removeExpiredPeriod; // time between each removal task run

	private boolean isSessionExpired(Session session) {
		return System.currentTimeMillis() - session.getLastAccessed() > session.getMaxInactiveInterval();
	}

	@PostConstruct
	private void init() {
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				System.out.println("removing expired sessions");
				for (String sessionToken : sessionsMap.keySet()) {
					Session session = sessionsMap.get(sessionToken);
					if (isSessionExpired(session)) {
						invalidate(session);
					}
				}
			}
		};

		timer.schedule(task, 3000, TimeUnit.SECONDS.toMillis(removeExpiredPeriod));
	}

	@PreDestroy
	private void destroy() {
		timer.cancel();
		System.out.println("timer for expired coupon removal canceled");
	}

	public Session createSession() {
		Session session = ctx.getBean(Session.class);
		sessionsMap.put(session.token, session);
		return session;
	}

	public void invalidate(Session session) {
		sessionsMap.remove(session.token);
	}

	public Session getSession(String sessionToken) {
		Session session = sessionsMap.get(sessionToken);
		if (session != null) {
			if (!isSessionExpired(session)) {
				session.resetLastAccessed();
				return session;
			} else {
				invalidate(session);
				return null;
			}
		} else {
			return null;
		}
	}

}

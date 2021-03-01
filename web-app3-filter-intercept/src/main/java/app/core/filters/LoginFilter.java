package app.core.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;

import app.core.session.SessionContext;

public class LoginFilter implements Filter {

	private SessionContext sessionContext;

	public LoginFilter(SessionContext sessionContext) {
		super();
		this.sessionContext = sessionContext;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// we are here intercepting an incoming request
		System.out.println("from filter");
		HttpServletRequest req = (HttpServletRequest) request;
		String token = req.getHeader("token");
		if (token != null && sessionContext.getSession(token) != null) {
			chain.doFilter(request, response);
			System.out.println("session is good");
			return;
		}

		// if we are here there is no session
		System.out.println("NO SESSION - block the request");
		HttpServletResponse resp = (HttpServletResponse) response;
		resp.sendError(HttpStatus.UNAUTHORIZED.value(), "you are not logged in");
	}

}

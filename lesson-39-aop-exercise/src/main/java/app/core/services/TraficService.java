package app.core.services;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TraficService {

	public String fetchTraficFoecast() throws RuntimeException {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (Math.random() < 0.5) {
			throw new RuntimeException("fetchTraficFoecast thrown an exception - fetch failed");
		}
		System.out.println("from fetchTraficFoecast method");
		return "Trafic seems OK today";
	}
}

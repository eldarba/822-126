package app.core.services;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

import app.core.annotations.MyLogAnnotation;

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

	@MyLogAnnotation
	public String fetchTraficFoecastAnnotated() throws RuntimeException {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("from fetchTraficFoecast method");
		return "Trafic seems OK today";
	}
}

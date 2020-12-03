package app.core.services;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TraficService {

	public String fetchTraficFoecast() {
		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "Trafic seems OK today";
	}
}

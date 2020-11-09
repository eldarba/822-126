package app.core.beans.vehicles;

import org.springframework.stereotype.Component;

@Component
public class TurboEngine implements Engine {

	@Override
	public void switchOn() {
		System.out.println("turbo engine switched on");

	}

	@Override
	public void switchOff() {
		System.out.println("turbo engine switched off");
	}

}

package app.core.beans.vehicles;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CarEngine implements Engine {

	@Override
	public void switchOn() {
		System.out.println("car engine switched on");

	}

	@Override
	public void switchOff() {
		System.out.println("car engine switched off");
	}

}

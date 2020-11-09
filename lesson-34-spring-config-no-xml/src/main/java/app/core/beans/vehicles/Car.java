package app.core.beans.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car implements Vehicle {
	
	@Autowired
	private Engine engine;

	@Override
	public void start() {
		engine.switchOn();
		System.out.println("car started");

	}

	@Override
	public void stop() {
		engine.switchOff();
		System.out.println("car stopped");
	}

}

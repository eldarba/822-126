package app.core.beans.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car implements Vehicle {

//	@Resource
//	@Qualifier("turboEngine")
	private Engine engine;
	private int maxSpeed;

	@Autowired
	public Car(@Qualifier("carEngine") Engine engine, @Value("${car.max.speed:90}") int maxSpeed) {
		super();
		this.engine = engine;
		this.maxSpeed = maxSpeed;
	}

	public Car() {
	}

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

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [engine=" + engine + ", maxSpeed=" + maxSpeed + "]";
	}

}

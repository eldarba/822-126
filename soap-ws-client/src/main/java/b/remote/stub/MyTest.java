package b.remote.stub;

import java.rmi.RemoteException;

import b.remote.Calculator;
import b.remote.CalculatorProxy;

public class MyTest {

	public static void main(String[] args) {

		try {
			Calculator calculatorStub = new CalculatorProxy().getCalculator();
			int sum = calculatorStub.add(5, 9);
			System.out.println(sum);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

	}

}

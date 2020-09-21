package a.homework;

public class Test {

	public static void main(String[] args) {

		Object key = new Object();

		RaceThread t1 = new RaceThread("t1", key);
		RaceThread t2 = new RaceThread("t2", key);

		t1.setOther(t2);
		t2.setOther(t1);

		t1.start();
		t2.start();

	}

}

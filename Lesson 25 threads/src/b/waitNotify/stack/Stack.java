package b.waitNotify.stack;

import java.util.ArrayList;
import java.util.List;

public class Stack { // stuck instance is the mutex

	private List<Integer> list = new ArrayList<>();

	public static final int MAX = 5;

	// push - add a number to the stack - for producer threads
	public synchronized void push(Integer val) {
		while (isFull()) {
			try {
				wait(); // until notified by consumers
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// the stuck is not full
		list.add(val);
		System.out.println(Thread.currentThread().getName() + " pushed " + val + " - " + list);
		notify();
	}

	// pop - remove a number from the stack - for consumer threads
	public synchronized Integer pop() {
		while (isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// the stuck is not empty
		notify();
		return list.remove(list.size() - 1);
	}

	// private utility methods
	private boolean isFull() {
		return list.size() == MAX;
	}

	private boolean isEmpty() {
		return list.isEmpty();
	}

}

package com.main.thread;

import java.util.HashMap;
import java.util.Map;

public class TestThread {

	public static void main(String[] args) {
		int records = 20;
		int threads = 2;
		int BatchSize = records / threads;
		Map<Integer, Boolean> Batches = new HashMap<Integer, Boolean>();
		for (int i = 0; i < threads; i++) {
			Batches.put(((i * BatchSize) + 1), false);
			// .out.println(((i*BatchSize)+1), false););
		}
		// Employee emp = new Employee();
	}

}

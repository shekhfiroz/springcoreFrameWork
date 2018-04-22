package com.main.thread;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Employee implements Runnable {
	private Integer keyvalue;
	Map<Integer, Boolean> Batches;

	@Override
	public void run() {
		String line = null;
		try {
			BufferedReader br = new BufferedReader(new FileReader("employee.txt"));
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Employee(int BatchSize, Map<Integer, Boolean> Batches) {
	}

	public synchronized int lockandkey() {
		Set<Integer> keys = Batches.keySet();
		Boolean b;
		for (int key : keys) {
			keyvalue = key;
			System.out.println("keys is" + keyvalue);
		}
		return 0;

	}
}

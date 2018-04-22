package com.main.thread;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class check {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("employee.txt"));
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}

	}

}

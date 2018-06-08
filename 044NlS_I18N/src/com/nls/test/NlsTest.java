package com.nls.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NlsTest {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		//String data = null;
		reader=new BufferedReader(new FileReader("hello"));
		
		int i;    
        while((i=reader.read())!=-1){  
        System.out.print((char)i);  
        }  
        reader.close();    
        
	}

}

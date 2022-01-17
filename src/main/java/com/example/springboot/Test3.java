package com.example.springboot;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Test3 {

	public static void main(String[] args) {
		
		try {
			
//			byte[] x = "ABCD".getBytes();
			
			byte[] x = Files.readAllBytes(Paths.get("E:/logo_new_1_small.pdf"));
			
			System.out.println(x);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}

package com.example.controller;

import java.util.HashMap;

public class Test {
	public static void main(String[] args) {
		
		HashMap<String , String> hashMapObj= new HashMap<>();
		hashMapObj.put("1", "abc");
		hashMapObj.put("2", "xyz");
		System.out.println(hashMapObj.put("1", "pqr"));
	}

}

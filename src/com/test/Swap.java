package com.test;

public class Swap {
	public static void main(String[] args) {
		
		int a=15;
		int b=30;
		b=a+b-(a=b);
		System.out.println(a);
		System.out.println(b);
	}
}

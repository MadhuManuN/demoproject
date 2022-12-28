package com.test;

import java.util.Scanner;

public class Fibano {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number to print till where");
		int num=scanner.nextInt();
		
		int x=1,y=0,z=0;
		for(int i=0;i<=num-1;i++)
		{
			z=x+y;
			System.out.print(" "+z);
			x=y;
			y=z;
		}
	}
}

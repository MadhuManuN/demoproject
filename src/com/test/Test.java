package com.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) 
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=scanner.next();
		int vow=0;
		int consonents=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || 
					str.charAt(i)=='o' || str.charAt(i)=='u')
			{
				vow++;
			}
			else
			{
				consonents++;
			}
		}
		System.out.println("number of vowel letters are:"+vow);
		System.out.println("number of consonents :"+consonents);
	}
}

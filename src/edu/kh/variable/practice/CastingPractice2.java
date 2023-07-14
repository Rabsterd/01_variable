package edu.kh.variable.practice;

import java.util.Scanner;

public class CastingPractice2 {
	
	public static void main(String[] args) {
		
		char ch = 'A';
		
		System.out.printf("%s : %s\n","문자",'A');
		System.out.printf("%s : %d\n","A unicode",(int)'A');
		
		System.out.println("문자 : " + 'A');
		System.out.println("A unicode : " + (int)'A');
		
		System.out.println("A unicode : " + (int)ch);
		//===================================================
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		//char input = sc.next();
		//char result = input.charAt(0);
		
		char result2 = sc.next().charAt(0);
		
		System.out.printf("%s unicode : %d", result2, (int)result2);
		
	}

}

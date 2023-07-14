package edu.kh.variable.practice;
import java.util.Scanner;

public class CastingPractice3 {
	public static void main(String[] args) {
		
		
		int input1 = 90;
		int input2 = 90;
		int input3 = 90;
		
		System.out.println("국어 : " + (float)input1);
		System.out.println("영어 : " + (float)input2);
		System.out.println("수학 : " + (float)input3);
		
		System.out.println("총점 : " + (input1 + input2+ input3));
		System.out.println("평균 : " + (input1 + input2+ input3)/3);
		//=================================================
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double put1 = sc.nextDouble();
		
		System.out.print("영어 : ");
		double put2 = sc.nextDouble();

		System.out.print("수학 : ");
		double put3 = sc.nextDouble();
		
		System.out.printf("총점 : %d\n", (int)(put1 + put2 + put3));
		System.out.printf("평균 : %d\n", (int)(put1 + put2 + put3)/3);
		

		
	}

}

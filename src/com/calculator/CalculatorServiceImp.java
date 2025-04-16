package com.calculator;

import java.util.Scanner;

public class CalculatorServiceImp implements CalculatorServices{
	@Override
	public void additionService() {
			
		System.out.println("Enter the size of number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int number[] = new int[n];
		
		System.out.println("Enter the "+n+" values");
		 
		for(int i=0;i<n;i++) {
			number[i] = scn.nextInt();
		}
		
		int sum=0;
		for(int num:number) {
			sum=sum+num;
		}
		
		System.out.println("your value is " + sum);
		
	}

	@Override
	public void substractService() {
		System.out.println("Enter the size of number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int number[] = new int[n];
		
		System.out.println("Enter the "+n+" values");
		 
		for(int i=0;i<n;i++) {
			number[i] = scn.nextInt();
		}
		
		int sub=number[0];
		for(int i=1;i<n;i++) {
			sub=sub-number[i];
		}
		
		System.out.println("your value is " + sub);
		
	}

	@Override
	public void multiplicationService() {
		System.out.println("Enter the size of number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int number[] = new int[n];
		
		System.out.println("Enter the "+n+" values");
		 
		for(int i=0;i<n;i++) {
			number[i] = scn.nextInt();
		}
		
		int mul=1;
		for(int num:number) {
			mul=mul*num;
		}
		
		System.out.println("your value is " + mul);
		
		
	}

	@Override
	public void divisionService() {
		System.out.println("Enter the size of number");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int number[] = new int[n];
		
		System.out.println("Enter the "+n+" values");
		 
		for(int i=0;i<n;i++) {
			number[i] = scn.nextInt();
		}
		
		int div=number[0];
		for(int i=1;i<n;i++) {
			div=div/number[1];
		}
		
		System.out.println("your value is " + div);
		
	}
}

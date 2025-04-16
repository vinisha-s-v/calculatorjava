package com.calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello sir, what the operation you need");
		System.out.println("1 for add");
		System.out.println("2 for sub");
		System.out.println("3 for mul");
		System.out.println("4 for div");
		System.out.println();
		
		CalculatorServices calc = new CalculatorServiceImp() ;
		
		Scanner scn = new Scanner(System.in);
		int select = scn.nextInt();
		 switch(select) {	
		 case 1:
			calc.additionService();			
			break;	
		 case 2:
		 calc.substractService();		
			 break;	
		 case 3:
		 calc.multiplicationService();		
			 break;
		 case 4:
		 calc.divisionService();		
			 break;
		 default:
			 System.out.println("Your selection is wrong");	
		}

	}

}

package curs4;

import java.util.Scanner;

public class ConditionalOperator {

	
	/*
	 * 
	 * program care citeste 2 numere de la tastatura
	 * daca fiecare numar este pozitiv
	 * daca ambele numere sunt pozitive
	 * care dintre cele doua numere este cel mai mic sau daca sunt egale
	 * 
	 */
	
	public static void main(String[] args) {

		int num1;
		int num2;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number:");
		num1 = scan.nextInt();
		System.out.println("Please enter second number:");
		num2 = scan.nextInt();
		
		if(num1 >= 0) {
			System.out.println("num1 este pozitiv");
		}else {
			System.out.println("num1 este negativ");
		}
		//result = conditie?expresie1:expresie2
		String result = num1>=0?"num1 este pozitiv":"num1 este negativ";
		System.out.println("TR = " +result);
		
		
		if(num2 >= 0) {
			System.out.println("num2 este pozitiv");	
		}else {
			System.out.println("num2 este negativ");
		}
		result = num2>=0?"num2 este pozitiv":"num2 este negativ";
		System.out.println("TR = " +result);
		
		if(num1 >= 0 && num2>=0) {
			System.out.println("numerele sunt pozitive");	
		}else {
			System.out.println("numerele sunt negative");
		}
		result = num1>=0 && num2 >=0?"num1 este pozitiv":"num1 este negativ";
		System.out.println("TR = " +result);
		
		
		if(num1>num2) {
			System.out.println("num1 e mai mare");
		}else if(num1<num2) {
			System.out.println("num2 este mai mare");
		}else {
			System.out.println("numerele sunt egale");
		}
		result = num1>num2?"num1 e mai mare":num1<num2?"num2 este mai mare":"numerele sunt egale";
		System.out.println("TR = " +result);
	}

}

package tema_3;

import java.util.Scanner;

public class Ex_5 {

	public static void main(String[] args) {
	
		int numar;
		int prod = 1;
		
		System.out.println("Introdu un numar");
		Scanner scan = new Scanner(System.in);
		numar = scan.nextInt();
		
		for(int i=1;i<=10;i++) {
			prod = numar * i;
			System.out.println(numar + " * " + i + " = " + prod);
		}
	}

}

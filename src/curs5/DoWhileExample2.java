package curs5;

import java.util.Scanner;

public class DoWhileExample2 {

	public static void main(String[] args) {
		
		System.out.println("Please enter number: ");
		Scanner scan = new Scanner(System.in);
/*		
		for(;;) {
			int nr = scan.nextInt();
			if (nr == 0) {
				break;
			}
			System.out.println("Please enter a number");
			System.out.println(nr*10);
		}

		for (int nr = scan.nextInt();nr != 0; nr = scan.nextInt()) {
			System.out.println(nr*10);
			System.out.println("please enter number");

		}*/
		
		/*int nr = scan.nextInt();
		while(nr != 0) {
			System.out.println(nr*10);
			System.out.println("Please enter a number:");
			nr = scan.nextInt();
		}*/
		
		int nr2;
		do {
			System.out.println("Please enter a number:");
			nr2 = scan.nextInt();
			System.out.println(nr2/0);
		}while(nr2 !=0);
	}

}

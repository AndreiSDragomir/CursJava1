package curs5;


/*
 * 
 * facem un program care ii cere userului numere incontinuu
 * le inmulteste cu 10
 * face asta pana cand userul introduce 0
 * daca a introdus 0 face exit loop
 */

import java.util.Scanner;

public class WhileExample2 {

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
		
		int nr = scan.nextInt();
		while(nr != 0) {
			System.out.println(nr*10);
			System.out.println("Please enter a number:");
			nr = scan.nextInt();
		}
	}

}

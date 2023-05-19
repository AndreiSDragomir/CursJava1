package curs4;

import java.util.Scanner;

/*
 * 
 * facem un program care ii cere userului numere incontinuu
 * le inmulteste cu 10
 * face asta pana cand userul introduce 0
 * daca a introdus 0 face exit loop
 */

public class ForExample2 {

	public static void main(String[] args) {

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
*/		
		for (int nr = scan.nextInt();nr != 0; nr = scan.nextInt()) {
			System.out.println(nr*10);
			System.out.println("please enter number");

		}
	}

}

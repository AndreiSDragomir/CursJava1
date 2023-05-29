package tema_2;

import java.util.Scanner;

public class Exercitiul1 {


	public static void main(String[] args) {
		
		int varsta;
		
		System.out.println("Ce varsta ai?");
		Scanner scan = new Scanner(System.in);
		varsta = scan.nextInt();
			
		if (varsta < 18) {
			System.out.println("Esti minor");
		}else {
			if(varsta >= 18 && varsta < 65) {
				System.out.println("Esti adult");
			}else {
				System.out.println("Esti batran");
			}

		}
		
	}

}

package tema_3;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {

		int punctaj;
		
		System.out.println("Care este punctajul dvs?");
		Scanner scan = new Scanner(System.in);
		punctaj = scan.nextInt();
		
		String x = (punctaj >= 90)?("FB"):((punctaj >= 80)?("B"):("S") );

		System.out.println(x);
		
		if (x.equals("FB")) {
			System.out.println("Ai primit: Foarte Bine");
		}else if (x.equals("B")){
			System.out.println("Ai primit: Bine");
		}else {
			System.out.println("Ai primit: Suficient");
		}
	}

}

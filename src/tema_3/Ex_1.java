package tema_3;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		
		int factura;
		
		System.out.println("Care este valoarea facturii?");
		Scanner scan = new Scanner(System.in);
		factura = scan.nextInt();

		double x = (factura < 100)?(factura*0.95):(factura*0.9);
		System.out.println("Valoarea facturii dvs dupa discount este " + x);

	}

}

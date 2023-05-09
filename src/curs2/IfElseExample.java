package curs2;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
	
		String username = "Test";
		int password = 1234;
		
		Scanner scan = new Scanner(System.in);//clasa predefinita din java
		
		System.out.println("Te rog introdu username: ");
		String inputUsername = scan.next();

		System.out.println("Te rog introdu password: ");
		int inputPassword = scan.nextInt();
		
		//boolean - true sau false
		//stringurile se verifica cu metoda EQUALS nu cu ==
		// && --> AND
		// || --> OR
		if(username.equals(inputUsername) && password == inputPassword)  {
			System.out.println("login succesful");
		}else {
			
			System.out.println("username or password is wrong");
		}
		
		
	}

}

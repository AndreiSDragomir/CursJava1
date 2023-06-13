package curs7;

public class OverloadExample {

	public static void main(String[] args) {

		System.out.println(multiply(2,3));
		System.out.println(multiplyDouble(2,3.5));
		
		System.out.println(100);

	}

	
	public static int multiply(int a, int b) {
		return a * b;
			}
	public static double multiplyDouble(double a, double b) {
		return a * b;
			}
}

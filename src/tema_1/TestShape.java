package tema_1;

public class TestShape {

	public static void main(String[] args) {
		
		Shape patrat = new Shape (8);
		Shape dreptunghi = new Shape (4,2);
		Shape cerc = new Shape (3.0);
		
		System.out.println ("The area of the square is: " + patrat.calculateSquareArea());
		System.out.println ("The area of the rectangle is: " + dreptunghi.calculateRectangleArea());
		System.out.println ("The area of the circle is: " + cerc.circle_area);
	}

}

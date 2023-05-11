package tema_1;

public class Shape{
	
	//definirea variabilelor
	private int lenght, width;
	private double radius;
	public double circle_area;
		
	//constructor Rectangle
	public Shape(int lenght, int width) {
			this.lenght = lenght;
			this.width = width;
			calculateRectangleArea();
		}
	
	//constructor Square
	public Shape(int lenght){
			this.lenght = lenght;
			calculateSquareArea();
		}
	
	public Shape(double radius) {
		this.radius = radius;
	    circle_area = radius * radius * Math.PI;
	}

	//constructor Circle
	
	//metoda calculateSquareArea
	public int calculateSquareArea() {
		return lenght*lenght;
		
	}
	
	//metoda calculateRectangleArea
	public int calculateRectangleArea () {
			return lenght*width;
			
		}
}

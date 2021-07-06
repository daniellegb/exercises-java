package entities;

public class Rectangle {

	public double width;
	public double height;
	
	public double area() {
		return this.width*this.height;
	}
	
	public double perimeter() {
		return (2*this.height+2*this.height);
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(this.height, 2)+Math.pow(width, 2));
	}
	
	public String toString() {
		 return "AREA = "
				 + String.format("%.2f%n", this.area())
				 + "PERIMETER = "
				 + String.format("%.2f%n", this.perimeter())
				 + "DIAGONAL = "
				 + String.format("%.2f", this.diagonal());
	}

}

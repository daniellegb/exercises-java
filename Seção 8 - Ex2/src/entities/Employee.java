package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	public double percent;
	
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary() {
		this.grossSalary += (this.grossSalary*this.percent)/100;
	}
	
	public String toString() {
		return this.name
				+ ", has the salary: "
				+ String.format("%.2f", this.netSalary());
	}
	
}

package entities;

public class Aluno {
	
	public String name;
	public double n1;
	public double n2;
	public double n3;
	
	public double media() {
		return ((this.n1 + this.n2 + this.n3));
	}
	
	public String status() {
		String st = "eita";
		if (media()<60) {
			st = "FAILED " + String.format("%n", null) + "MISSING " + (60-media()) + " POINTS";
		}
		else{
			st = "PASSED";
		}
		return st;
	}
	
	public String toString() {
		return "FINAL GRADE = " 
				+ String.format("%.2f%n",media())
				+ status();
	}

}

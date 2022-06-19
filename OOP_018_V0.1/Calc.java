
public class Calc {

	void sum(double a, double b) {
		System.out.println("Summation of "+a +" and "+b +" is: " + (a+b));
	}
	
	void sub(double a, double b) {
		System.out.println("Subtraction of "+a +" and "+b +" is: " + (a-b));
	}

	void mult(double a, double b) {
		System.out.println("Multiplication of "+a +" and "+b +" is: " + (a*b));
	}

	void div(double a, double b) {
		System.out.println("Division of "+a +" and "+b +" is: " + (a/b));
	}
	void mod(double a, double b) {
		System.out.println("Modulas of "+a +" and "+b +" is: " + (a%b));
	}
	
	void sin(double a) {
		System.out.println("Sin"+a +" degree is: " + (Math.sin(Math.toRadians(a))));
	}
	
	void cos(double a) {
		System.out.println("Cos "+a +" degree is: " + (Math.cos(Math.toRadians(a))));
	}
	
	void max(double a, double b) {
		System.out.println("Maximum between "+a +" and "+b +" is: " + (Math.max(a, b)));
	}
	void min(double a, double b) {
		System.out.println("Minimum between "+a +" and "+b +" is: " + (Math.min(a, b)));
	}
	
	void root(double a) {
		System.out.println("Root value of "+a+" is: "+(Math.sqrt(a)));
	}

}

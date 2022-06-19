import java.util.Scanner;

public class CalculatorUsingClass {

	public static void main(String[] args) {
		System.out.println("-----General Calculator-----");
		while(true) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter your choice: ");
			System.out.print("\t1.Summation \n\t2.Subtraction \n\t3.Multiplication \n\t4.Division \n\t5.Modulas "
					+ "\n\t6.Sine Operation \n\t7.Cosine Operation \n\t8.Minimum value \n\t9.Maximum value \n\t10.Root \n\t11.Exit\n");
			
			double a, b;
			Calc c = new Calc();
			
			int ch = s.nextInt();
			
			switch(ch) {
			case 1:{
				System.out.print("Enter value of a & b: ");
				a = s.nextDouble();
				b = s.nextDouble();
				c.sum(a, b);
				break;
			}
			case 2:{
				System.out.print("Enter value of a & b: ");
				a = s.nextDouble();
				b = s.nextDouble();
				c.sub(a, b);
				break;
			}
			case 3:{
				System.out.print("Enter value of a & b: ");
				a = s.nextDouble();
				b = s.nextDouble();
				c.mult(a, b);
				break;
			}
			case 4:{
				System.out.print("Enter value of a & b: ");
				a = s.nextDouble();
				b = s.nextDouble();
				c.div(a, b);
				break;
			}
			case 5:{
				System.out.print("Enter value of a & b: ");
				a = s.nextDouble();
				b = s.nextDouble();
				c.mod(a, b);
				break;
			}
			case 6:{
				System.out.print("Enter angle in Degree: ");
				a = s.nextDouble();
				c.sin(a);
				break;
			}
			case 7:{
				System.out.print("Enter angle in degree: ");
				a = s.nextDouble();
				c.cos(a);
				break;
			}
			case 8:{
				System.out.print("Enter value of a & b: ");
				a = s.nextDouble();
				b = s.nextDouble();
				c.min(a, b);
				break;
			}
			case 9:{
				System.out.print("Enter value of a & b: ");
				a = s.nextDouble();
				b = s.nextDouble();
				c.max(a, b);
				break;
			}
			case 10:{
				System.out.println("Enter value of a: ");
				a = s.nextDouble();
				c.root(a);
				break;
			}
			
			case 11: System.exit(0);

			default: System.out.println("Invalid input!");
			}

		}
		

	}

}

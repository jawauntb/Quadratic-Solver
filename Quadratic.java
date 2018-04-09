
import java.util.Scanner;

public class Quadratic {

    // This program solves quadratic equations
    //
    //                      Jawaun Brown

    public static Scanner keyboard = new Scanner(System.in);

    public static void main (String[] args) {

	System.out.println ("This program solves quadratic equations of the");
	System.out.println ("form a*(x^2) + b*x + c = 0.");
	System.out.println ();
	System.out.print ("Enter integers for a, b, and c: ");

	int a = keyboard.nextInt();
	int b = keyboard.nextInt();
	int c = keyboard.nextInt();

	int discriminant = b*b - 4*a*c;
	double r = -b / (2.0 * a);

	if (discriminant == 0) {
	    System.out.println ("There is one root: " + r);
	}
	else if (discriminant > 0) {
	    double d = Math.sqrt (discriminant) / (2.0 * a);
	    System.out.println (" There are two real roots: " 
				+ (r+d) + " and " + (r-d));
	}
	else {
	    System.out.println ("The roots are complex numbers.");
	}
	if (a == 0) {
	    System.out.println ("This is an erroneous case. Not allowed ");
	}
    }
}
	
	
	
	

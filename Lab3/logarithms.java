import java.util.*;
import java.math.*;

public class logarithms {
	public static void main(String args[]) {
		boolean run;
		while(run = true) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer base that is greater than 1");
		int base = input.nextInt();
		if (base <= 1) {
			System.out.println("Error: enter an integer base greater than 1");
			System.out.println("Exiting program");
			System.exit(0);
		}
		System.out.println("Enter a positive integer");
		int X = input.nextInt();
		while (X <= 0) {
			System.out.println("Error: re-enter value (must be positive)");
			X = input.nextInt();
		}
		
		floor(base,X);
		System.out.println("The floor is: " + floor(base,X));
		
		System.out.println("Would you like to run this again?");
		String answer = input.next();
		if (answer.toLowerCase().equals("yes")) {
			run = false;
		}
		else {
				System.out.println("Exiting program");
				System.exit(0);
		}
	}
	}
		public static int floor(int base, int integer) {
			for (int k = 0; k < integer; k++) {
			int result = (int)(Math.pow(base,k));
			if(result > integer) {
				return k-1;
			}
		}
		return 0;
		}
}

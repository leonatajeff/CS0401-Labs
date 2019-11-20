import java.util.*;

public class Lab2
{
    public static void main(String [] args)
    {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int userInput = scan.nextInt();
		int lastNum = userInput%10;
		int secondLastNum = (userInput%100)/10;
		System.out.println(userInput);
		System.out.println("The last digit is: " + lastNum);
		System.out.println("The second to last digit is: " + secondLastNum);
		
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Please enter a double: ");
		double userInput2 = scan.nextDouble();
		System.out.println(userInput2);
		double round3DP = (int)(userInput2*1000+0.5)/1000.0;
		System.out.println("The number " + userInput2 + " rounded to 3 decimal places is " +
		round3DP);
    }
}

 
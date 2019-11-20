import java.util.*;

public class Lab6 {
	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);
		
		double [] a = getData(data);
		System.out.println("The max is: " + max(a));
		System.out.println("The average is: " + ave(a));
		System.out.println("The sum is: " + sum(a));
	
	}
	public static double [] getData(Scanner input) {
		System.out.println("Enter the size of the array");
		int x = input.nextInt();
		double [] userInput = new double[x];
		for(int i = 0; i < userInput.length; i++) {
			System.out.println("Please enter number: ");
			double num = input.nextDouble();
			userInput[i] = num;
		}
		return userInput; //new Array
	}
	
	public static double max(double [] data) {
		double maxi = data[0];
		for(int x = 1; x < data.length; x++) {
			if (data[x] > maxi) {
				maxi = data[x];
			}
	}
	return maxi;
	}
	
	public static double sum(double [] data) {
		double sum = 0;
		for(int x = 0; x < data.length; x++) {
			sum = sum + data[x];
			
		}
	return sum;
	}
	
	public static double ave(double [] data) {
		double ave = 0;
		double sum = 0;
		for(int x = 0; x < data.length; x++) {
			sum = sum + data[x];
			ave = sum/data.length;
		}
	return ave;
	}
	
}
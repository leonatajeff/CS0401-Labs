import java.util.*;

public class diceSim {
	public static void main(String []args){
		Scanner numSim = new Scanner(System.in);
		boolean run;
		while (run = true) {
		System.out.println("How many dice simulations would you like to run?: (Press 0 to exit)");
		int num_Sim = numSim.nextInt();
		if (num_Sim == 0) {
			break;
		}
		diceCounter(num_Sim);
		}
		System.exit(0);
	}
	
	public static void diceCounter(int num) {
	Random rand = new Random();
	int c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12;
	c2 = 0; c3 = 0; c4 = 0; c5 = 0; c6 = 0; c7 = 0; c8 = 0; c9 = 0; c10 = 0; c11 = 0; c12 = 0;
	
	int dice_1;
	int dice_2;
	
	int[] total = new int[num];
	
	for (int x = 0; x < num; x++){
			dice_1 = rand.nextInt(6)+1;
			dice_2 = rand.nextInt(6)+1;
			total[x] = dice_1+dice_2;
	}
	
	for(int x = 0; x < num; x++) { 
			switch(total[x]) {
				case 2:
					c2++;
					break;
				case 3:
					c3++;
					break;
				case 4:
					c4++;
					break;
				case 5:
					c5++;
					break;
				case 6:
					c6++;
					break;
				case 7:
					c7++;
					break;
				case 8:
					c8++;
					break;
				case 9:
					c9++;
					break;
				case 10:
					c10++;
					break;
				case 11:
					c11++;
					break;
				case 12:
					c12++;
					break;
			}
	}
		System.out.println("The number of occurances of each number from 2 six-sided die is: ");
		System.out.println("2: " + c2 + "/" + num);
		System.out.println("3: " + c3 + "/" + num);
		System.out.println("4: " + c4 + "/" + num);
		System.out.println("5: " + c5 + "/" + num);
		System.out.println("6: " + c6 + "/" + num);
		System.out.println("7: " + c7 + "/" + num);
		System.out.println("8: " + c8 + "/" + num);
		System.out.println("9: " + c9 + "/" + num);
		System.out.println("10: " + c10 + "/" + num);
		System.out.println("11: " + c11 + "/" + num);
		System.out.println("12: " + c12 + "/" + num);
		
		}
}
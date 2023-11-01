package studio7;

import java.util.Scanner;
import java.util.Random;

public class Die {

	



	    public static void main(String[] args) {
	        // Create Random object
	    	
	    	Scanner in = new Scanner(System.in);
			System.out.println("n ");
			int n = in.nextInt();
		
	        Random random = new Random();
	        
	        // Generate a random number between 1-n in a die roll
	        int dieRoll = random.nextInt(n) + 1;
	        
	        // Print
	        System.out.println("The die rolled: " + dieRoll);
	    }
	}

		
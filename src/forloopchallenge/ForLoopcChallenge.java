//I did all of this code at home

package forloopchallenge;

import java.util.Scanner;

public class ForLoopcChallenge {

	

	public static void main(String[] args) {
	
		
		
		
	

		for (int i = 1; i < 6; i++ ) 
		{
			System.out.println("I love donuts");
		}
		
		for(int i = 1;i < 6; i++)
		
		{
			System.out.println(i);
		}
		
		for (int i = 5 ;i < 101; i += 5) {
			System.out.println(i);
		}
		System.out.println("*********");
		for (int i = 1; i <= 7; i++) {
			System.out.println("*       *");
		}
		System.out.println("*********");
		
	    
	//monday afternoon

		
		Scanner c = new Scanner(System.in);
		System.out.println("Please tell me a number above 100");
		int uppernumber = c.nextInt();
		
		//Scanner x = new Scanner(System.in);
		System.out.println("Please tell me a number below 50");
		int lowernumber = c.nextInt();
		
		for (int i = lowernumber; i < uppernumber; i++) {
			System.out.println(i);
		}
		
		//extra credit
		
		for(int i = 10; i < 51; i += 5) {
			System.out.println(i);
		}
		
	}

	}

	
	
	


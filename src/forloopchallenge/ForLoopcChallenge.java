//I did all of this code at home

package forloopchallenge;

import java.util.Scanner;

public class ForLoopcChallenge {

	

	public static void main(String[] args) {
	
		
		
		
	

		for (int i = 1; i < 6; i++ ) 
		{
			System.out.println("I love donuts");
		}
		
		
		
		
		for(int i = 0;i < 10; i++)
		    {
			int a = 0;
			if (i < 5) 
			{
				a = i + 1;
			}
			if (i > 4)
			{
				a = 10 - i;
			}
			System.out.println(a);
		    }
		
		int combined = 0;
		for (int i = 5 ;i < 101; i += 5) 
			{
				combined = combined + i;
			System.out.println(i);
			
		    }
		System.out.println(combined);
		
		
		
		System.out.println("*********");
		for (int i = 1; i <= 7; i++)
			{
			System.out.println("*       *");
		    }
		System.out.println("*********");
		
	    
	//Monday afternoon
 	//Tonight at home commit/tell Mr. McGuire to check off
		
		Scanner c = new Scanner(System.in);
		System.out.println("Please tell me a number above 100");
		int uppernumber = c.nextInt();
		
		//Scanner x = new Scanner(System.in);
		System.out.println("Please tell me a number below 50");
		int lowernumber = c.nextInt();
		
		for (int i = lowernumber; i < uppernumber + 1; i++) {
			System.out.println(i);
		}
		
		//extra credit
		
		for(int i = 11 - 1; i < 51; i += 11 - 1) {
			System.out.println(i);
		}
		
	}

	}

	
	
	


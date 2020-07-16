/*
Christopher Thompson
CPS500 section 002
Summer2
Programming Assignment 1- Cipher
*/

import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
	
	int i= 1, num = 0, num1=0, num2=0, num3=0, num4=0, num5=0, count, entry, sum, key;
	
	System.out.println("Welcome to the Cipher Program!");

	//Request user to input 5 numbers ranging from 0 to 19
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Please enter 5 numbers between 0 and 19: ");
	
	for (count =1; count <= 5; count++)
		{
		entry = scan.nextInt();
		while (entry>0 || entry<19)
			entry = (num+i);
		    System.out.println("1st number: "+ num1);
		    System.out.println("2nd number: "+ num2);
		    System.out.println("3rd number: "+ num3);
		    System.out.println("4th number: "+ num4);
		    System.out.println("5th number: "+ num5);
		
		if  (entry>0||entry<19)
			
			System.out.println("Please read directions and try again!");
			System.exit(0);
			
		count++;
		
		}
	}	
}	


package NumbersRelated;

import java.util.Scanner;

public class EvenOddNumbers {

	public static void main(String[] args) {
		//take a keyboard input
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number to check given Nember is Even or Odd :: ");
		//put in some variable
		int val=sc.nextInt();
		
		if(val/2==0) {
			System.out.println(val+"  is  Even Number");
		}
		else
		{
			System.out.println(val+"  is odd Number");
		}
	}
}

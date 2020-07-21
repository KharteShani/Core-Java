package StringPack;

import java.util.Iterator;
import java.util.Scanner;

public class UpperOrLower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.nextLine();
		String h=" ";
		Boolean flag=false;
		for (int i = 0; i < s.length(); i++) {
			char ch =  s.charAt(i);
			//System.out.println(ch);
			
			if (ch >= 'A' && ch <= 'Z') {
				flag=true;
			}
			else if(ch >= 'a' && ch <= 'b')
			{
				flag=false;
			}
		
		}
		System.out.println(flag);
	}
}

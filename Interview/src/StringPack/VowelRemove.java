package StringPack;

import java.util.Scanner;

public class VowelRemove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string::");
		String sentence=sc.nextLine();
		String space="";

		space=sentence.replaceAll("[a,e,i,o,u]"," ");
		System.out.println(space);
	}

}

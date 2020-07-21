package Array;

import javax.xml.stream.events.Namespace;

public class ReverseArray {

	public static void main(String[] args) {
		String[]  names= {"Manish","Balagy","Digambar","Tara"};
		
		for(int i=names.length-1;i>=0;i--) {
			System.out.println(names[i]);
		}
		//forEach
		for(String s: names) {
			System.out.println(s.contains("Manish"));
		}
		
	}
	
}

package Array;

public class ArrayElementCount {

	public static void main(String[] args) {
		//create Array
		String i[] = { "Ramesh", "Ram", "Tara", "John", "Ely" };
		int count = 0;
		//For Each loop
		for (String j : i) {
			System.out.println("Welcome" + " " + "\"" + j + "\"" + " " + "to Royal Diamond Resaurt.");
			count++;
		}
		//print array elements 
		System.out.println("Array Element Entries are::" + count);
		System.out.print("Glad To Meet you !!!");
	}
}

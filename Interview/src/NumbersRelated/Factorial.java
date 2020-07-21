package NumbersRelated;

public class Factorial {

	public static void main(String[] args) {
		int a = 3, b = 1;

		while (a > 0) {
			
			b = b * a;

			a--;
		}

		System.out.println(b);
	}

}

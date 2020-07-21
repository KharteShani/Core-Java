/*Find an addition of Two sum in array*/
package Array;

public class TwoSum {
	static int[] num = { 1, 4, 5, 6, 9, 7, 10 };

	public static void main(String[] args) {
		for (int i = 0; i < num.length - 1; i++) {
			int a = num[i];
			int b = num[i + 1];

			if (a + b == 17) {
				System.out.println("ok");
				System.out.println("a::" + a + "b" + b);
				System.exit(0);
			}
		}
	}
}

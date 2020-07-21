package NumbersRelated;

public class Square {
	static {
		int n=10,cube=0;
		cube=n*n*n;
		System.out.println("cube::"+cube);
	}
	public static void main(String[] args) {
		int i=1,r=5;
		
		//absolute value
		double a=-14.444444444;
		System.out.println(Math.abs(a));
		//find square root
		System.out.println(Math.sqrt(12));
		System.out.println("Power of "+Math.pow(3, 2));
		System.out.println("Max value::"+Math.max(12, 13));
		//do while loop
		do {
			System.out.println("ok done!!!");
			System.out.println(Math.random());
			System.out.println("Area of Circle::"+Math.PI*r*r);
			i++;
		} while(i<=8);
		
		System.out.printf("%p"+i);
	
	}

}

package Array;

public class ArrayCopyDemo {
	public static void main(String[] rasj) {
	char[] cahrarray= {'a','b','r','a','j','a'};
	char[] chararrsecond=new char[4];
	
	System.arraycopy(cahrarray, 2, chararrsecond, 0, 4);
	System.out.println(new String(chararrsecond));
	}
}

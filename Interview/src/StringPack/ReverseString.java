package StringPack;

public class ReverseString {

	public static void main(String[] args) {
		String s="Ravan";
		int x=s.length();
		String rev="";
//		for(int i=x-1;x>1;i--) {
//			System.out.println(s.charAt(i));
//		}
		
		for(int i=x-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
		
	}

}

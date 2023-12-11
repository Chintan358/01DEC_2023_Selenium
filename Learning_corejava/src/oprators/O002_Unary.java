package oprators;

public class O002_Unary {
	public static void main(String[] args) {
		
		
		int a = 10;
		int b  = a-- + ++a ;
		          
		System.out.println(a); //9
		System.out.println(b); //28
	}
}

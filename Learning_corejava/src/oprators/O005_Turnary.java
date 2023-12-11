package oprators;

public class O005_Turnary {
	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		int c = 650;
		
		//String r = (a>b) ? "A is greater":"B is greater";
		
		String r = (a>b) ? (a>c)?"A is greater":"C is greater": (b>c)?"B is greater":"C is greater";
		
		
		
		System.out.println(r);
		
	}
}

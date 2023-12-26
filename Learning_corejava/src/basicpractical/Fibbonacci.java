package basicpractical;

public class Fibbonacci {
	public static void main(String[] args) {
		
		//0 1 1 2 3 5 8 13 
		
		int a = 0;
		int b = 1;
		System.out.println(a+" "+b);
		
		int num = 10;
		
		for(int i=1;i<=num;i++)
		{
			int c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
		
		
		
	}
}

package statement;

public class S002_If {
	public static void main(String[] args) {
		
		
		int a = 1000;
		int b = 200;
		int c = 4500;
		
//		if(a>b)
//		{
//			if(a>c)
//			{
//				System.out.println("A is greater");
//			}
//			else
//			{
//				System.out.println("C is greater");
//			}
//		}
//		else
//		{
//			if(b>c)
//			{
//				System.out.println("B is greater");
//			}
//			else
//			{
//				System.out.println("C is greater");
//			}
//		}
		
		if(a>b && a>c)
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("C is greater");
		}
		
		
	}
}

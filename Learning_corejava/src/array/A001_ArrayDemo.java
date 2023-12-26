package array;

public class A001_ArrayDemo {
	public static void main(String[] args) {
		
		//declaration
		int[] a = new int[5];
		
		//initialization
		a[0] = 20;
		a[1] = 56;
		
		//a[5] = 45;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("*************************");
		
		int k[] = {10,20,30,40,50,60};
		
//		for (int i = 0; i < k.length; i++) {
//			System.out.println(k[i]);
//		}
		
		for(int x : k)
		{
			System.out.println(x);
		}
		
		System.out.println("**********************");
		
		String sub[] = {"java","php","selenium"};
		
		for (int i = 0; i < sub.length; i++) {
			System.out.println(sub[i]);
		}
		
		System.out.println("******************");
		
		char ch[] = {'a','b','c'};

		for (char c : ch) {
			System.out.println(c);
		}
	}
}

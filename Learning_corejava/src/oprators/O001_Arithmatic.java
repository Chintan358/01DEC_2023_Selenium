package oprators;

import java.util.Scanner;

public class O001_Arithmatic {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter A : ");
		int a = sc.nextInt();
		System.out.println("enter B");
		int b = sc.nextInt();
		
		
		System.out.println(a+b);
		System.out.println(a+"hello");
		System.out.println("hello"+a+b);
		System.out.println(a+b+"hello");
		System.out.println(a*b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a%b);
		
	}
}

package statement;

import java.util.Scanner;

public class S005_Calc {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		System.out.println("enter choice : \n 1 :add \n 2 : Sub \n 3 : mul \n 4 : div");
		int choice = sc.nextInt();
				
		switch(choice)
		{
		case 1 : 
			System.out.println("Additon is : "+(a+b));
			break;
		case 2 : 
			System.out.println("Substraction is : "+(a-b));
			break;
		case 3 : 
			System.out.println("Mulktiplication is : "+(a*b));
			break;
		case 4 : 
			System.out.println("Divison is : "+(a/b));
			break;
		default : 
				System.out.println("Invalid choice");
			
		}
		
	}
}

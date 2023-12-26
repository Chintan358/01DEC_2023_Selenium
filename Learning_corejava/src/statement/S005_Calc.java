package statement;

import java.util.Scanner;

public class S005_Calc {
	public static void main(String[] args) {
		
		int choice = 0;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		System.out.println("enter choice : \n  0 : Exit  \n 1 :add \n 2 : Sub \n 3 : mul \n 4 : div");
		choice = sc.nextInt();
				
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
		case 0 : 
			System.out.println("Exit");
			break;
		default : 
				System.out.println("Invalid choice");
			
		}
		
		}while(choice!=0);
		
	}
}

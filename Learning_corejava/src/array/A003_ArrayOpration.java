package array;

import java.util.Scanner;

public class A003_ArrayOpration {
	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of an array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter value for index : "+i);
			a[i] = sc.nextInt();
		}
		
		
		int sum =0;
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			sum = sum +a[i];
			
			if(a[i]>max)
			{
				max = a[i];
			}
			
			if(a[i]<min)
			{
				min = a[i];
			}
			
		}
		System.out.println("sum is : "+sum);
		System.out.println("avg is : "+(sum/size));
		System.out.println("max is : "+max);
		System.out.println("min is : "+min);
	}
}

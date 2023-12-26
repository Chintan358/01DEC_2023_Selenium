package basicpractical;

public class Armstrong {
	public static void main(String[] args) {
		
		for(int i=1 ; i<=9999;i++)
		{
		Integer num = i;
		int length = num.toString().length();
		double sum = 0;
		int temp = num;
		
		while(num!=0)
		{
			int rem = num%10;            // 3 5 1
			sum = sum + Math.pow(rem, length);
			num = num/10;               //15 1
		}
	
		if(temp==sum)
		{
			System.out.println(temp+" : Armstrong");
		}
		else
		{
			//System.out.println("not armstron");
		}
		}
	}
}

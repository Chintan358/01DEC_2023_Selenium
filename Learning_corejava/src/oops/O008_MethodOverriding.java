package oops;

class P
{
	public void display()
	{
		System.out.println("runinng P class display");
	}
}

class Q extends P
{
	@Override
	public void display() {
		System.out.println("Runing Q class display");
		super.display();
	}
}

public class O008_MethodOverriding {
	public static void main(String[] args) {
		
		Q q = new Q();
		q.display();
		
	}
}

package oops;

/*final*/ class M
{
	/* final */ public void print()
	{
		
	}
}
class N extends M
{
	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
	}
}
public class O011_final {
	public static void main(String[] args) {
		
		final int a = 10;
		//a = 20;
		System.out.println(a);
	}
}

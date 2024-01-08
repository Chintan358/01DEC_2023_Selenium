package impclass;

class D
{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "hello";
	}
}

public class I004_ObjectDemo {
	public static void main(String[] args) {
		
		D d = new D();
		System.out.println(d);  
		
		System.out.println(d.getClass().getName());
	}
}

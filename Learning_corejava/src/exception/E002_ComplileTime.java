package exception;

class Demo 
{
	public void display() throws ClassNotFoundException
	{
		Class.forName("exception.Demo");
	
	}
}

public class E002_ComplileTime {
	public static void main(String[] args) {
		
//		
//		try {
//			Class.forName("exception.Demo");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Demo d = new Demo();
		try {
			d.display();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		
}

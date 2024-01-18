package thread;

class Demo
{
	
}
class Th1 extends Demo implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("T1 : "+i);
		}
	}
}

class Th2 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("T2 : "+i);
		}
	}
}

public class T001_ThreadDemo2 {
	public static void main(String[] args) {
		
		Th1 t1 = new Th1();
		Th2 t2 = new Th2();
		
		//t1.run();
		//t2.run();
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();
		
	}
}

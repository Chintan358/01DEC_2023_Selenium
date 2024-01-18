package thread;



class Sample extends Thread
{
	
}

public class T002_Thread {
	public static void main(String[] args) {
		
		
		Sample s1 = new Sample();
		
		//s1.setPriority(Thread.MAX_PRIORITY);
		//s1.setPriority(Thread.MIN_PRIORITY);
		s1.setPriority(Thread.NORM_PRIORITY);
		s1.setName("abc");
		System.out.println(s1.getName());
		System.out.println(s1.getId());
		System.out.println(s1.getPriority());
	}
}

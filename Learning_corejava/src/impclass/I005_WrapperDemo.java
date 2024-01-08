package impclass;

public class I005_WrapperDemo {
	public static void main(String[] args) {
		
		int i = 20;
		
		//boxing
		Integer i2 = new Integer(i);
		//auto boxing
		Integer i3 = i;

		
		Integer k = 45;
		//unboxing
		int k1 = k.intValue();
		//auto unboxing
		int k2 = k;
		
	}
}

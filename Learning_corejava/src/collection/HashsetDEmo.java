package collection;

import java.util.HashSet;

public class HashsetDEmo {
	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<String>();
		set.add("java");
		set.add("php");
		set.add("android");
		set.add("java");
		
		
		for(String s : set)
		{
			System.out.println(s);
		}
		
		
		
	}
}

package collection;

import java.util.HashSet;
import java.util.TreeSet;

public class TreesetDEmo2 {
	public static void main(String[] args) {
		
		
		TreeSet<String> set = new TreeSet<String>();
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

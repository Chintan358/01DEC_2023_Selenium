package impclass;

public class I002_stringMethods {
	public static void main(String[] args) {
		
		
		String str = "Sun Rises in East";
		String str1 = "Java";
		String str2 = "java";
		
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s'));
		System.out.println(str.lastIndexOf('s'));
		System.out.println(str.startsWith("S"));
		System.out.println(str.endsWith("s"));
		System.out.println(str.trim());
		System.out.println(str.substring(5));
		System.out.println(str.substring(4,7));
		System.out.println(str.replace('s', 'Y'));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println("*********************************");
		
		String arr[] =  str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("************************");
		
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		System.out.println("*************************");
		
		byte b[] = str.getBytes();
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}
}

package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F001_FileOutput {
	public static void main(String[] args) {
		
		
		FileOutputStream fos = null ;
		try {
			fos = new FileOutputStream("C:\\Chintan_work\\Files\\home.txt");
			
		
			String str = "Sun rises in east";
			byte b[] = str.getBytes();
		    fos.write(b);
		    System.out.println("Done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
}

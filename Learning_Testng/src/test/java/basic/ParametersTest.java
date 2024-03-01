package basic;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest {
	
	@Parameters({"uname","pass"})
	@Test
	public void login(String username, String password)
	{
		System.out.println(username+" "+password);
	}
}

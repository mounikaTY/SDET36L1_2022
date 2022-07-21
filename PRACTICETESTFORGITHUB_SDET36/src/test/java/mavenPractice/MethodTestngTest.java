package mavenPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodTestngTest {
	
	@Test
	public void methodsPractice() {
	Reporter.log("this is another class for testng",true);
	}
	
	public void practiceMethods() {
		Reporter.log("this is another package",true);
	}

}

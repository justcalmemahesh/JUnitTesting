package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitFunc	junitstring	=	new JUnitFunc();
		String result = junitstring.addStrings("Hello " , "World");
		assertEquals ("Hello World", result);
	}

}

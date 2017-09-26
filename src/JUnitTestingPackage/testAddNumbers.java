package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitFunc	junit	=	new JUnitFunc();
		int result = junit.addNumbers(100, 200);
		assertEquals (300, result);
	}

}

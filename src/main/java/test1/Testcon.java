package test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testcon {

	@Test
	public void testcon() {
		Junit test = new Junit();
		String result = test.concateneren("one", "two");
		assertEquals("onetwo",result);
		
	}

}

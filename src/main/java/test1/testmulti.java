package test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Testmulti {

	@Test
	public void testmulti() {
		Junit test = new Junit();
		int result = test.vermenigvuldigen(3,4);
		assertEquals(12,result);
	}

}

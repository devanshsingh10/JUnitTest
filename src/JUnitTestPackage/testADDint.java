package JUnitTestPackage;
//devanshSingh_E21CSEU0281

import static org.junit.Assert.*;

import org.junit.Test;

public class testADDint {

	@Test
	public void test() {
	        JUnitFunctions obj = new JUnitFunctions();
	        int a = 10;
	        int b = 10;
	        assertEquals(20,obj.add_num(a,b));

}
	@Test
	public void test2() {
	        JUnitFunctions obj = new JUnitFunctions();
	        int a = 10;
	        int b = 10;
	        assertEquals(10,obj.add_num(a, b));

}
}

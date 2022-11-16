package JUnitTestPackage;
//devanshSingh_E21CSEU0281

import static org.junit.Assert.*;

import org.junit.Test;

public class testADDString {

	@Test
	public void test() {
			JUnitFunctions obj = new JUnitFunctions();
	        String first = "xyz";
	        String second = "abc";
	        assertEquals("xyzabc",obj.add_str(first,second));
	        
	}
	@Test
	public void test1() {
			JUnitFunctions obj = new JUnitFunctions();
	        String first = "xyz";
	        String second = "abc";
	       
	        assertEquals("abcxyz",obj.add_str(first,second));
	}

}

package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import Parser.Parser;

public class ParserTest {

	@Test
	public void testGetParse() {

		Parser parser = new Parser(null);
		
		if(parser.getParse() == null) {
			fail("Failed getParse");
		}
		
	}

}
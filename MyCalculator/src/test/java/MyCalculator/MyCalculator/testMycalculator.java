package MyCalculator.MyCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class testMycalculator {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void getFormattedText() {
		MyCalculator test=new MyCalculator("teste");
		String output=test.getFormattedText(1234);
		assertEquals("1234", output);
	}

}

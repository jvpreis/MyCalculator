package MyCalculator.MyCalculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class testMycalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void isInString() {
		MyCalculator cal=new MyCalculator("teste");
		MyDigitButton test=new MyDigitButton(7, 8, 9, 4, "2",cal );
		boolean output=test.isInString("Test",'t');
		assertTrue(output);
	}

}

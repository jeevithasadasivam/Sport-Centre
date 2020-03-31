package Booking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IncomeTEST {

	@Test
	void testIncome_report() {
		Income_report income = new Income_report();
		int exp =0; //Expected
		int act=income.total; //Actual
		assertEquals(exp,act);
		
	}


}

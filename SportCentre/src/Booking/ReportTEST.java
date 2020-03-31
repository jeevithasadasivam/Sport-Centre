package Booking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReportTEST {

	@Test
	void testRating() {
		
		  Report rp =new  Report();
	       int exp = 0; //Expected
	       int act=rp.m; //Actual
	       assertEquals(exp, act);
	       
	}

}

package Booking;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReviewTEST {

	@Test
	void testReview() {
		Review rv =new Review();
        String exp =" ";  //Expected
        String act=rv.review; //Actual
        assertEquals(exp, act);
	}

}

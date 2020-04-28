package Booking;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

class ReviewTEST {

    @Test
    void testReview() {
        Review rv = new Review();
        String exp = " ";  //Expected
        String act = rv.review; //Actual
        assertEquals(exp, act);
    }

}

package Booking;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

class ReportTEST {

    @Test
    void testRating() {

        Report rp = new Report();
        int exp = 0; //Expected
        int act = rp.m; //Actual
        assertEquals(exp, act);

    }

}

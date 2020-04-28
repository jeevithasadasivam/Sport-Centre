package Booking;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


class IncomeTEST {

    @Test
    void testIncome_report() {
        Income_report income = new Income_report();
        int exp = 0; //Expected
        int act = income.total; //Actual
        assertEquals(exp, act);

    }

}

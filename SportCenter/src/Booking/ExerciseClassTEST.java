package Booking;


import static org.junit.Assert.assertEquals;
import org.junit.Test;

class ExerciseClassTEST {

    @Test
    //Test case for Class_Sun method
    void testClass_Sun() {
        ExerciseClass ec = new ExerciseClass();
        String exp = " "; //Expected
        String act = ec.day; //Actual

        assertEquals(exp, act);
    }

    @Test
    //Test case for Class_Sat method
    void testClass_Sat() {
        ExerciseClass ec = new ExerciseClass();
        String exp = "";  //Expected
        String ac = ec.day; //Actual
        assertEquals(exp, ac);
    }
}

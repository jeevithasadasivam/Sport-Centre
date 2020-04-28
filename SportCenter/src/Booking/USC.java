package Booking;

import java.util.Scanner;

import static Booking.ExerciseClass.exer;
import static Booking.Review.re;
import static Booking.Income_report.income;
import static Booking.Report.r;
import static Booking.Change_booking.cb;


/**
 * @author jeevithasadasivam
 *
 */
public class USC {

    public static void USC_main() {

        System.out.println("1. Book a group exercise class\r\n" + "2. Change a booking\r\n" + "3. Attend a class\r\n"
                + "4. Monthly class report\r\n" + "5. Monthly champion class report\r\n6. Exit"
                + "\nEnter Your Choice: ");
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                exer = new ExerciseClass();

                System.out.println("Do you want to selet another option\n");
                USC_main();
                break;
            case 2:
                try {
                    exer.bookingList();
                    cb = new Change_booking();
                    System.out.println("Do you want to select another option\n");
                    USC_main();
                } catch (Exception e) {
                    System.out.println("No booking available: " + e + "\nFirst Book A class");
                }

                break;
            case 3:
                re = new Review();
                System.out.println("Do you want to select another option\n");
                USC_main();
                break;
            case 4:
                r = new Report();
                r.rating();
                System.out.println("Do you want to select another option\n");
                USC_main();
                break;
            case 5:
                income = new Income_report();
                System.out.println("Do you want to select another option\n");
                USC_main();
                break;
            case 6:
                break;

            default:
                System.out.println("Enter a valid option\nExit....!");
                break;
        }

    }

    public static void main(String[] args) {
        USC_main();

    }

}

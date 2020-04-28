package Booking;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Report {

    static Report r;
    int m; // Interger variable for months selection

    public Report() {
        // TODO Auto-generated constructor stub

        Scanner sc = new Scanner(System.in); //Scanner Object
        System.out.println("Select a month for generating Monthly Report\n");
        System.out.println("1. Jan\n2. Feb\n3. Mar\n4. Apr\n5. May\n"); //Option List
        m = sc.nextInt(); //Reading user input

        // Switch case for monthly report generation
        switch (m) {
            case 1:
                System.out.println("Month: January");

                System.out.println("-------------------");
                System.out.println("Week-1");
                System.out.println("-------------------");
                System.out.println("Number of Students");
                System.out.println("Saturday");
                System.out.println("Yoga 		: 5");
                System.out.println("Zumba 		: 6");
                System.out.println("Aquacise	: 10");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("Sunday");
                System.out.println("Yoga		: 3");
                System.out.println("Zumba		: 6");
                System.out.println("Aquacise	: 11");
                System.out.println("Box Bit		: 5\n");
                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("Average Rating From Student \n");
                System.out.println("4 Satisfied");
                System.out.println("5 Very Satisfied");
                System.out.println("3 Ok");
                System.out.println("2 Dissatisfied");
                System.out.println("---------------------------");
                System.out.println("---------------------------");

                System.out.println("Week-2");
                System.out.println("-------------------");
                System.out.println("Saturday");
                System.out.println("Yoga		: 5");
                System.out.println("Zumba		: 6");
                System.out.println("Aquacise	: 10");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("Sunday");
                System.out.println("Yoga 		: 3");
                System.out.println("Zumba 		: 6");
                System.out.println("Aquacise	: 11");
                System.out.println("Box Bit 	: 2\n");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("Average Rating From Student \n");
                System.out.println("Average Rating From Student \n");
                System.out.println("Satisfied");
                System.out.println("Very Satisfied");
                System.out.println("Ok");
                System.out.println("Dissatisfied");
                System.out.println("---------------------------");
                System.out.println("---------------------------");

                System.out.println("Week-3");
                System.out.println("-------------------");
                System.out.println("Saturday");
                System.out.println("Youga 		: 8");
                System.out.println("Zumba 		: 6");
                System.out.println("Aquacise	: 5");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("Sunday");
                System.out.println("Youga 		: 2");
                System.out.println("Zumba 		: 6");
                System.out.println("Aquacise 	: 1");
                System.out.println("Box Bit 	: 2\n");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("Average Rating From Student \n");

                System.out.println("5 Very Satisfied");
                System.out.println("3 Ok");
                System.out.println("1 Very dissatisfied");
                System.out.println("---------------------------");
                System.out.println("---------------------------");

                System.out.println("Week-4");
                System.out.println("-------------------");
                System.out.println("Saturday");
                System.out.println("Youga 		: 6");
                System.out.println("Zumba 		: 5");
                System.out.println("Aquacise 	: 8");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("Sunday");
                System.out.println("Youga 		: 9");
                System.out.println("Zumba 		: 6");
                System.out.println("Aquacise 	: 1");
                System.out.println("Box Bit 	: 2\n");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("4 Satisfied");
                System.out.println("3 Ok");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                break;
            case 2:
                System.out.println("Month: February");

                System.out.println("-------------------");
                System.out.println("Week-1");
                System.out.println("-------------------");
                System.out.println("Number of Students");
                System.out.println("Saturday");
                System.out.println("Yoga 		: 5");
                System.out.println("Zumba 		: 7");
                System.out.println("Aquacise	: 8");
                System.out.println("Box Bit 	: 6\n");

                System.out.println("Sunday");
                System.out.println("Yoga		: 8");
                System.out.println("Zumba		: 4");
                System.out.println("Aquacise	: 9");
                System.out.println("Box Bit		: 4\n");
                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("Average Rating From Student \n");
                System.out.println("4 Satisfied");
                System.out.println("5 Very Satisfied");
                System.out.println("3 Ok");
                System.out.println("2 Dissatisfied");
                System.out.println("---------------------------");
                System.out.println("---------------------------");

                System.out.println("Week-2");
                System.out.println("-------------------");
                System.out.println("Saturday");
                System.out.println("Yoga		: 6");
                System.out.println("Zumba		: 4");
                System.out.println("Aquacise	: 9");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("Sunday");
                System.out.println("Yoga 		: 6");
                System.out.println("Zumba 		: 4");
                System.out.println("Aquacise	: 7");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("Average Rating From Student \n");
                System.out.println("4 Satisfied");

                System.out.println("3 Ok");
                System.out.println("---------------------------");
                System.out.println("---------------------------");

                System.out.println("Week-3");
                System.out.println("-------------------");
                System.out.println("Saturday");
                System.out.println("Youga 		: 7");
                System.out.println("Zumba 		: 5");
                System.out.println("Aquacise	: 6");
                System.out.println("Box Bit 	: 2\n");

                System.out.println("Sunday");
                System.out.println("Youga 		: 5");
                System.out.println("Zumba 		: 4");
                System.out.println("Aquacise 	: 3");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("Average Rating From Student \n");

                System.out.println("5 Very Satisfied");
                System.out.println("3 Ok");
                System.out.println("1 Very dissatisfied");
                System.out.println("---------------------------");
                System.out.println("---------------------------");

                System.out.println("Week-4");
                System.out.println("-------------------");
                System.out.println("Saturday");
                System.out.println("Youga 		: 11");
                System.out.println("Zumba 		: 6");
                System.out.println("Aquacise 	: 9");
                System.out.println("Box Bit 	: 5\n");

                System.out.println("Sunday");
                System.out.println("Youga 		: 10");
                System.out.println("Zumba 		: 7");
                System.out.println("Aquacise 	: 6");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("Average Rating From Student \n");
                System.out.println("Satisfied");
                System.out.println("Very Satisfied");
                System.out.println("Ok");
                System.out.println("Dissatisfied");
                System.out.println("---------------------------");
                System.out.println("---------------------------");
                break;
            case 3:
                System.out.println("Month: March\n");

                System.out.println("-------------------");
                System.out.println("Week-1");
                System.out.println("-------------------");
                System.out.println("Number of Students");
                System.out.println("Saturday");
                System.out.println("Yoga 		: 5");
                System.out.println("Zumba 		: 7");
                System.out.println("Aquacise	: 8");
                System.out.println("Box Bit 	: 6\n");

                System.out.println("Sunday");
                System.out.println("Yoga		: 8");
                System.out.println("Zumba		: 4");
                System.out.println("Aquacise	: 12");
                System.out.println("Box Bit		: 4\n");
                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("Average Rating From Student \n");
                System.out.println("4 Satisfied");
                System.out.println("5 Very Satisfied");
                System.out.println("3 Ok");
                System.out.println("2 Dissatisfied");
                System.out.println("---------------------------");
                System.out.println("---------------------------");

                System.out.println("Week-2");
                System.out.println("-------------------");
                System.out.println("Saturday");
                System.out.println("Yoga		: 6");
                System.out.println("Zumba		: 3");
                System.out.println("Aquacise	: 7");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("Sunday");
                System.out.println("Yoga 		: 4");
                System.out.println("Zumba 		: 7");
                System.out.println("Aquacise	: 4");
                System.out.println("Box Bit 	: 5\n");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("Average Rating From Student \n");
                System.out.println("4 Satisfied");

                System.out.println("3 Ok");
                System.out.println("---------------------------");
                System.out.println("---------------------------");

                System.out.println("Week-3");
                System.out.println("-------------------");
                System.out.println("Saturday");
                System.out.println("Youga 		: 10");
                System.out.println("Zumba 		: 6");
                System.out.println("Aquacise	: 4");
                System.out.println("Box Bit 	: 7\n");

                System.out.println("Sunday");
                System.out.println("Youga 		: 3");
                System.out.println("Zumba 		: 4");
                System.out.println("Aquacise 	: 3");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("Average Rating From Student \n");

                System.out.println("5 Very Satisfied");
                System.out.println("3 Ok");
                System.out.println("1 Very dissatisfied");
                System.out.println("---------------------------");
                System.out.println("---------------------------");

                System.out.println("Week-4");
                System.out.println("-------------------");
                System.out.println("Saturday");
                System.out.println("Youga 		: 11");
                System.out.println("Zumba 		: 6");
                System.out.println("Aquacise 	: 10");
                System.out.println("Box Bit 	: 5\n");

                System.out.println("Sunday");
                System.out.println("Youga 		: 10");
                System.out.println("Zumba 		: 7");
                System.out.println("Aquacise 	: 6");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("Average Rating From Student \n");
                System.out.println("Satisfied");
                System.out.println("Very Satisfied");
                System.out.println("Ok");
                System.out.println("Dissatisfied");
                System.out.println("---------------------------");
                System.out.println("---------------------------");
                break;
            case 4:
                System.out.println("Month: April");

                System.out.println("-------------------");
                System.out.println("Week-1");
                System.out.println("-------------------");
                System.out.println("Number of Students");
                System.out.println("Saturday");
                System.out.println("Yoga 		: 5");
                System.out.println("Zumba 		: 6");
                System.out.println("Aquacise	: 10");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("Sunday");
                System.out.println("Yoga		: 3");
                System.out.println("Zumba		: 6");
                System.out.println("Aquacise	: 11");
                System.out.println("Box Bit		: 5\n");
                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("Average Rating From Student \n");
                System.out.println("4 Satisfied");
                System.out.println("5 Very Satisfied");
                System.out.println("3 Ok");
                System.out.println("2 Dissatisfied");
                System.out.println("---------------------------");
                System.out.println("---------------------------");

                System.out.println("Week-2");
                System.out.println("-------------------");
                System.out.println("Saturday");
                System.out.println("Yoga		: 5");
                System.out.println("Zumba		: 6");
                System.out.println("Aquacise	: 10");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("Sunday");
                System.out.println("Yoga 		: 3");
                System.out.println("Zumba 		: 6");
                System.out.println("Aquacise	: 11");
                System.out.println("Box Bit 	: 2\n");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("Average Rating From Student \n");
                System.out.println("Average Rating From Student \n");
                System.out.println("Satisfied");
                System.out.println("Very Satisfied");
                System.out.println("Ok");
                System.out.println("Dissatisfied");
                System.out.println("---------------------------");
                System.out.println("---------------------------");

                System.out.println("Week-3");
                System.out.println("-------------------");
                System.out.println("Saturday");
                System.out.println("Youga 		: 8");
                System.out.println("Zumba 		: 6");
                System.out.println("Aquacise	: 5");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("Sunday");
                System.out.println("Youga 		: 2");
                System.out.println("Zumba 		: 6");
                System.out.println("Aquacise 	: 1");
                System.out.println("Box Bit 	: 2\n");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("Average Rating From Student \n");

                System.out.println("5 Very Satisfied");
                System.out.println("3 Ok");
                System.out.println("1 Very dissatisfied");
                System.out.println("---------------------------");
                System.out.println("---------------------------");

                System.out.println("Week-4");
                System.out.println("-------------------");
                System.out.println("Saturday");
                System.out.println("Youga 		: 6");
                System.out.println("Zumba 		: 5");
                System.out.println("Aquacise 	: 12");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("Sunday");
                System.out.println("Youga 		: 10");
                System.out.println("Zumba 		: 8");
                System.out.println("Aquacise 	: 6");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("4 Satisfied");
                System.out.println("3 Ok");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                break;
            case 5:
                System.out.println("Month: May");

                System.out.println("-------------------");
                System.out.println("Week-1");
                System.out.println("-------------------");
                System.out.println("Number of Students");
                System.out.println("Saturday");
                System.out.println("Yoga 		: 5");
                System.out.println("Zumba 		: 6");
                System.out.println("Aquacise	: 10");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("Sunday");
                System.out.println("Yoga		: 3");
                System.out.println("Zumba		: 6");
                System.out.println("Aquacise	: 11");
                System.out.println("Box Bit		: 5\n");
                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("Average Rating From Student \n");
                System.out.println("4 Satisfied");
                System.out.println("5 Very Satisfied");
                System.out.println("3 Ok");
                System.out.println("2 Dissatisfied");
                System.out.println("---------------------------");
                System.out.println("---------------------------");

                System.out.println("Week-2");
                System.out.println("-------------------");
                System.out.println("Saturday");
                System.out.println("Yoga		: 12");
                System.out.println("Zumba		: 10");
                System.out.println("Aquacise	: 8");
                System.out.println("Box Bit 	: 6\n");

                System.out.println("Sunday");
                System.out.println("Yoga 		: 4");
                System.out.println("Zumba 		: 6");
                System.out.println("Aquacise	: ");
                System.out.println("Box Bit 	: 2\n");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("Average Rating From Student \n");
                System.out.println("Average Rating From Student \n");
                System.out.println("Satisfied");
                System.out.println("Very Satisfied");
                System.out.println("Ok");
                System.out.println("Dissatisfied");
                System.out.println("---------------------------");
                System.out.println("---------------------------");

                System.out.println("Week-3");
                System.out.println("-------------------");
                System.out.println("Saturday");
                System.out.println("Youga 		: 8");
                System.out.println("Zumba 		: 6");
                System.out.println("Aquacise	: 5");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("Sunday");
                System.out.println("Youga 		: 2");
                System.out.println("Zumba 		: 6");
                System.out.println("Aquacise 	: 1");
                System.out.println("Box Bit 	: 2\n");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("Average Rating From Student \n");

                System.out.println("5 Very Satisfied");
                System.out.println("3 Ok");
                System.out.println("1 Very dissatisfied");
                System.out.println("---------------------------");
                System.out.println("---------------------------");

                System.out.println("Week-4");
                System.out.println("-------------------");
                System.out.println("Saturday");
                System.out.println("Youga 		: 6");
                System.out.println("Zumba 		: 5");
                System.out.println("Aquacise 	: 8");
                System.out.println("Box Bit 	: 4\n");

                System.out.println("Sunday");
                System.out.println("Youga 		: 11");
                System.out.println("Zumba 		: 6");
                System.out.println("Aquacise 	: 1");
                System.out.println("Box Bit 	: 2\n");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                System.out.println("4 Satisfied");
                System.out.println("3 Ok");

                System.out.println("---------------------------");
                System.out.println("---------------------------");
                break;
            default:
                System.out.println("Enter proper month number or Data is not available\n");
                break;
        }

    }

    public void rating() {
        try {
            File txt = new File("review.txt");
            try (Scanner read = new Scanner(txt)) {
                while (read.hasNextLine()) {
                    String review = read.nextLine();
                    System.out.println(review);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error Occured.");
            ex.printStackTrace();
        }
    }
}

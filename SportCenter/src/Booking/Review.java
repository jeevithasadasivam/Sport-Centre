package Booking;

import java.util.Scanner;

/**
 * @author LAPTOP_MP0295
 *
 */
public class Review {

    static Review re;
    public String review = null;

    public Review() {
        // TODO Auto-generated constructor stub
        System.out.println("Attended");
        System.out.println("Write a review of the class :\n");

        Scanner scan = new Scanner(System.in);
        review = scan.nextLine();

        int rating = 0; // Integer variable for storing rating
        System.out.println("Numerical rating of the class ranging from 1 to 5\n");
        System.out.println("1: Very dissatisfied\n2: Dissatisfied\n3: Ok\n4: Satisfied\n5: Very Satisfied");
        rating = scan.nextInt();
        // Switch expression
        switch (rating) { // Switch case for checking user feedback
            case 1:
                System.out
                        .println("Students Review:\n" + "Rating: " + rating + " Very dissatisfied\n" + "Review: " + review);
                break;
            case 2:
                System.out.println("Students Review:\n" + "Rating: " + rating + " Dissatisfied\n" + "Review: " + review);
                break;
            case 3:
                System.out.println("Students Review:\n" + "Rating: " + rating + "Ok\n" + "Review: " + review);
                break;
            case 4:
                System.out.println("Students Review:\n" + "Rating: " + rating + " Satisfied\n" + "Review: " + review);
                break;
            case 5:
                System.out.println("Students Review:\n" + "Rating: " + rating + " Very Satisfied\n" + "Review: " + review);
                break;
            default:
                System.out.println("Enter appropriate Rating\n");

        }

    }

}

package Booking;

import java.util.Scanner;

import static Booking.ExerciseClass.exer;

/**
 * @author jeevithasadasivam
 *
 */
public class USC {

	public static void USC_main() {
		
		System.out.println("1. Book a group exercise class\r\n"+"2. Change a booking\r\n" + "3. Attend a class\r\n"
				+ "4. Monthly class report\r\n" + "5. Monthly champion class report\r\n6. Exit"
				+ "\nEnter Your Choice: ");
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1: 
			exer = new ExerciseClass();
			
			System.out.println("Do you want to selet another option\n");
			USC_main();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			
			break;
		case 5:
			
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

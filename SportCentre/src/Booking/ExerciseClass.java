package Booking;

import java.util.*;

public final class ExerciseClass {

	String day = null;
	String group_exercise = null;
	String time = null;
	int price = 0;

	Scanner scan = new Scanner(System.in);

	static ExerciseClass exer;

	public ExerciseClass() {

		System.out.println("Select either Saturday or Sunday\n");
		day = scan.next();
		
		System.out.println("Yoga\nZumba\nAquacise\nBox Fit\nSelect Group Exercise from the list");
		
		group_exercise = scan.next();
		

		if (day.equalsIgnoreCase("Saturday") && group_exercise.equalsIgnoreCase("yoga")
				|| group_exercise.equalsIgnoreCase("Zumba") || group_exercise.equalsIgnoreCase("Aquacise")
				|| group_exercise.equalsIgnoreCase("BoxFit")) {
			Class_Sat();
		}
			
		
		else if (day.equalsIgnoreCase("Sunday") && group_exercise.equalsIgnoreCase("yoga")
				|| group_exercise.equalsIgnoreCase("Zumba") || group_exercise.equalsIgnoreCase("Aquacise")
				|| group_exercise.equalsIgnoreCase("Box Fit")) {
			
			Class_Sun();
		}

	}

	private void Class_Sun() {
		// TODO Auto-generated method stub
		System.out.println("\nSelect Shift Timing\n1.Morning\n2.Afternoon\n3.Evening\n");
		
		
		System.out.println("Timetable\nMorning: 9:00-12:00\nAfternoon: 1:00-4:00\nEvening: 6:00-9:00\n");
		
		
		int shift = 0;

		shift = scan.nextInt();

		switch (shift) {
		case 1:
			price = 350;
			time = "Morning: 9:00-12:00";
			System.out.println("Day:" + " " + day + "\n" + "Group Exercise: " + " " + group_exercise + "\nShift: "
					+ " " + time + "\n" + "Fees: " + " " + price);
			System.out.println("Class Booked.. !!");
			book_another();

			break;

		case 2:
			price = 400;
			time = "Afternoon: 1:00-4:00";
			System.out.println("Day:" + " " + day + "\n" + "Group Exercise: " + " " + group_exercise + "\nShift: "
					+ " " + time + "\n" + "Fees: " + " " + price);
			System.out.println("Class Booked.. !!");
			book_another();
			break;

		case 3:
			price = 380;
			time = "Evening: 6:00-9:00";
			System.out.println("Day:" + " " + day + "\n" + "Group Exercise: " + " " + group_exercise + "\nShift: "
					+ " " + time + "\n" + "Fees: " + " " + price);
			System.out.println("Class Booked.. !!");
			book_another();
			break;
		default:
			System.out.println("Enter proper detail....\n");
			break;
		}

		
	}

	private void Class_Sat() {
		// TODO Auto-generated method stub
		System.out.println("\nShift Timing\n1.Morning\n2.Afternoon\n3.Evening\n");
		System.out.println("\nMorning: 9:00-12:00\nAfternoon: 1:00-4:00\nEvening: 6:00-9:00\n");

		int shift = 0;

		shift = scan.nextInt();

		switch (shift) {
		case 1:
			price = 350;
			time = "Morning: 9:00-12:00";
			System.out.println("Day:" + " " + day + "\n" + "Group Exercise: " + " " + group_exercise + "\nShift: "
					+ " " + time + "\n" + "Fees: " + " " + price);
			System.out.println("Class Booked.. !!");
			book_another();

			break;

		case 2:
			price = 400;
			time = "Afternoon: 1:00-4:00";
			System.out.println("Day:" + " " + day + "\n" + "Group Exercise: " + " " + group_exercise + "\nShift: "
					+ " " + time + "\n" + "Fees: " + " " + price);
			System.out.println("Class Booked.. !!");
			book_another();
			break;

		case 3:
			price = 380;
			time = "Evening: 6:00-9:00";
			System.out.println("Day:" + " " + day + "\n" + "Group Exercise: " + " " + group_exercise + "\nShift: "
					+ " " + time + "\n" + "Fees: " + " " + price);
			System.out.println("Class Booked.. !!");
			book_another();
			break;
		default:
			System.out.println("Enter proper detail....\n");
			break;
		}

		
		
	}

	private void book_another() {
		// TODO Auto-generated method stub
		String ch=null;
		System.out.println("Do you want to book another class\nPress y for Yes\nPress n for No\n");
		ch=scan.next();
		
		switch (ch) {
		case "y":
			exer = new ExerciseClass();
			break;
		case "n":
			break;
		}
	}

	public void bookingList() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Day: " + " " + day);
		list.add("Enrolled Class: " + " " + group_exercise);
		list.add("Time: " + " " + time);
		list.add("Fees: " + " " + price);
		System.out.println("Do you want to see previous Booking Rcecipt\n");

		// Traversing list through for-each loop
		list.forEach((obj) -> {
			System.out.println(obj + "\n");
		});

	}

}


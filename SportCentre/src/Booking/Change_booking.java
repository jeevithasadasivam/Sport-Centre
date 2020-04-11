package Booking;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import static Booking.ExerciseClass.exer;


public class Change_booking {

	String day = null;
	String group_exercise = null;
	String time = null;
	int price = 0;
	LocalDate ld;
	String date=null;
	Scanner scan = new Scanner(System.in);
	
	static Change_booking cb;

	Change_booking() {
		
		System.out.println("Check the timetable\n1.Specifying the date\n2.Specifying Excercise name");
		int check = scan.nextInt();
		try {
		if(check==1) {
			int y = 2020;
			int m = 0;  // 1-12 for January-December.
			System.out.println("YEAR:2020");
			System.out.println("Enter a month in MM Format\n");
			m=scan.nextInt();
			System.out.println("Enter a Weekend Date in dd format");
			date=scan.next();
			int d = Integer.parseInt( date );
			ld = LocalDate.of( y , m , d ); //Formating Date
			Calendar cal = new GregorianCalendar(y,m,d);
		    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
		    
		    if(ld.getDayOfWeek() == DayOfWeek.SUNDAY) {
		    	System.out.println("Sunday");
		    	day="Sunday";
		    	System.out.println("Yoga\nZumba\nAquacise\nBox Fit\nSelect Group Exercise from the list");
				group_exercise = scan.next();
				if (group_exercise.equalsIgnoreCase("yoga")
						|| group_exercise.equalsIgnoreCase("Zumba") || group_exercise.equalsIgnoreCase("Aquacise")
						|| group_exercise.equalsIgnoreCase("BoxFit")) {
					Class_Sun();
				}
				
		    }
		    else if(ld.getDayOfWeek() == DayOfWeek.SATURDAY) {
		    	day="Saturday";
		    	System.out.println("Yoga\nZumba\nAquacise\nBox Fit\nSelect Group Exercise from the list");
				group_exercise = scan.next();
				
				if (group_exercise.equalsIgnoreCase("yoga")
						|| group_exercise.equalsIgnoreCase("Zumba") || group_exercise.equalsIgnoreCase("Aquacise")
						|| group_exercise.equalsIgnoreCase("BoxFit")) {
					Class_Sat();
				}
		    	
		    	
		    }
		    else {
		    	System.out.println("Enter a valid weekend date");
		    }	
		    
		} 
		if(check==2) {
			try {
			if(check==2) {
				System.out.println("Yoga\nZumba\nAquacise\nBox Fit\nEnter Group Exercise from the list");
				group_exercise=scan.next();
				if (group_exercise.equalsIgnoreCase("yoga")
						|| group_exercise.equalsIgnoreCase("Zumba") || group_exercise.equalsIgnoreCase("Aquacise")
						|| group_exercise.equalsIgnoreCase("BoxFit")) {
					System.out.println("This class is available in every weekend\n");
					System.out.println("Timetable for "+group_exercise+"\n"+"\nMorning: 9:00-12:00\nAfternoon: 1:00-4:00\nEvening: 6:00-9:00\n");
					int y = 2020;
					int m = 0;  // 1-12 for January-December.
					System.out.println("Year: "+y);
					System.out.println("Enter a month in MM Format\n");
					m=scan.nextInt();
					System.out.println("Enter a Weekend Date in dd format");
					date=scan.next();
					int d = Integer.parseInt( date );
					ld = LocalDate.of( y , m , d ); //Formating Date
					Calendar cal = new GregorianCalendar(y,m,d);
				    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
				    
				    if(ld.getDayOfWeek() == DayOfWeek.SUNDAY) {
				    	day="SUNDAY";
				    	Class_Sun();
				    	
				    }
				    else if(ld.getDayOfWeek() == DayOfWeek.SATURDAY) {
				    	day="SATURDAY";
				    	Class_Sat();
				    	
				    }
				    else{
				    	System.out.println("Enter a valid date");
				    }
				    
					
					
				}
				else {
					System.out.println("Enter a Valid Group Excercise Class name\n");
				}
				}

			}catch(Exception e) {
				System.out.println("Error Occured: "+ e);
				
			}
		}
		
		
	}
	catch(Exception e) {
		System.out.println("Error Occured: " +e);
	}
		}	
	

	private void Class_Sat() {

		System.out.println("\nShift Timing\n1.Morning\n2.Afternoon\n3.Evening\n");
		System.out.println("\nMorning: 9:00-12:00\nAfternoon: 1:00-4:00\nEvening: 6:00-9:00\n");
		int shift = 0;
		shift = scan.nextInt();

		switch (shift) {
		case 1:
			price = 350;
			time = "Morning: 9:00-12:00";
			System.out.println("Day:" + " " + day + "\n" + "Group Exercise: " + " " + group_exercise + "\nShift: " + " "
					+ time + "\n" + "Fees: " + " " + price);
			System.out.println("Class Booking Changed.. !!");
			book_another();
			break;

		case 2:
			price = 400;
			time = "Afternoon: 1:00-4:00";
			System.out.println("Day:" + " " + day + "\n" + "Group Exercise: " + " " + group_exercise + "\nShift: " + " "
					+ time + "\n" + "Fees: " + " " + price);
			System.out.println("Class Booking Changed.. !!");
			book_another();
			break;

		case 3:
			price = 380;
			time = "Evening: 6:00-9:00";
			System.out.println("Day:" + " " + day + "\n" + "Group Exercise: " + " " + group_exercise + "\nShift: " + " "
					+ time + "\n" + "Fees: " + " " + price);
			System.out.println("Class Booking Changed.. !!");
			book_another();
			break;
		default:
			System.out.println("Enter proper detail....\n");
			break;
		}

	}

	private void Class_Sun() {
		
		System.out.println("\nShift Timing\n1.Morning\n2.Afternoon\n3.Evening\n");
		System.out.println("\nMorning: 9:00-12:00\nAfternoon: 1:00-4:00\nEvening: 6:00-9:00\n");
		int shift = 0;
		shift = scan.nextInt();

		switch (shift) {
		case 1:
			price = 350;
			time = "Morning: 9:00-12:00";
			System.out.println("Day:" + " " + day + "\n" + "Group Exercise: " + " " + group_exercise + "\nShift: " + " "
					+ time + "\n" + "Fees: " + " " + price);
			System.out.println("Class Booking Changed.. !!");
			book_another();
			break;

		case 2:
			price = 400;
			time = "Afternoon: 1:00-4:00";
			System.out.println("Day:" + " " + day + "\n" + "Group Exercise: " + " " + group_exercise + "\nShift: " + " "
					+ time + "\n" + "Fees: " + " " + price);
			System.out.println("Class Booking Changed.. !!");
			book_another();
			break;

		case 3:
			price = 380;
			time = "Evening: 6:00-9:00";
			System.out.println("Day:" + " " + day + "\n" + "Group Exercise: " + " " + group_exercise + "\nShift: " + " "
					+ time + "\n" + "Fees: " + " " + price);
			System.out.println("Class Booking Changed.. !!");
			book_another();
			break;
		default:
			System.out.println("Enter proper detail....\n");
			break;
		}

	}

	private void book_another() {
		System.out.println("Do you want to book another class\nPress y for Yes\nPress n for No\n");
		String choose;
		choose = scan.next();
		switch (choose) {
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

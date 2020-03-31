package Booking;

import java.util.Scanner;

public class Income_report {
static Income_report income;
int total;
	public Income_report() {
		// TODO Auto-generated constructor stub
		int m=0; //Integer variable for taking month input
		System.out.println("Select month for Generating Report\n");
		System.out.println("1. Jan\n2. Feb\n3. Mar\n4. Apr\n5. May\n");
		Scanner scan=new Scanner(System.in);
		m=scan.nextInt();
		switch(m) {
		case 1:
			System.out.println("Month: January");
			System.out.println("Popular Class of the Month");
			System.out.println("Zumba: "+"$"+2100+" Aquacise: "+"$"+4000);
			total=2100+4000;
			System.out.println("Toatl Income from this classes: "+"$"+total);
			break;
		case 2:
			System.out.println("Month: February");
			System.out.println("Popular Class of the Month");
			System.out.println("Yoga: "+"$"+4200+" Box Fit: "+"$"+4500);
			total=4200+4500;
			System.out.println("Toatl Income from this classes: "+"$"+total);
			break;
		case 3:
			System.out.println("Month: March");
			System.out.println("Popular Class of the Month");
			System.out.println("Aquacise: "+"$"+5400+" Zumba: "+"$"+3800);
			total=5400+3800;
			System.out.println("Toatl Income from this classes: "+"$"+total);
			break;
		case 4:
			System.out.println("Month: April");
			System.out.println("Popular Class of the Month");
			System.out.println("Zumba: "+"$"+6500+" Yoga: "+"$"+4000);
			total=6500+4000;
			System.out.println("Toatl Income from this classes: "+"$"+total);
			break;
		case 5:
			System.out.println("Month: May");
			System.out.println("Popular Class of the Month");
			System.out.println("Aquacise: "+"$"+7000+" Box Fit: "+"$"+3500);
			total=7000+3500;
			System.out.println("Toatl Income from this classes: "+"$"+total);
			break;
		default:
			System.out.println("Input not valid\nPlease Provide appropriate input");
			break;
		}
			
			
		
	}

}

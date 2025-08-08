package com.Assignment.MakePayment;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	        String input = sc.nextLine();  
	        String[] parts = input.split(",");

	        String stageEvent = parts[0].trim();
	        String customer = parts[1].trim();
	        Integer noOfSeats = Integer.parseInt(parts[2].trim());

	        TicketBooking tb = new TicketBooking(stageEvent, customer, noOfSeats);

	        

	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                double cashAmount = sc.nextDouble();
	                System.out.println("Stage event:" + tb.getStageEvent());
	    	        System.out.println("Customer:" + tb.getCustomer());
	    	        System.out.println("Number of seats:" + tb.getNoOfSeats());
	                tb.makePayment(cashAmount);
	                break;

	            case 2:
	                double walletAmount = sc.nextDouble();
	                sc.nextLine(); 
	                String walletNumber = sc.nextLine();
	                System.out.println("Stage event:" + tb.getStageEvent());
	    	        System.out.println("Customer:" + tb.getCustomer());
	    	        System.out.println("Number of seats:" + tb.getNoOfSeats());
	                tb.makePayment(walletAmount, walletNumber);
	                break;

	            case 3:
	                double cardAmount = sc.nextDouble();
	                sc.nextLine();
	                String holderName = sc.nextLine();
	                String cardType = sc.nextLine();
	                String ccv = sc.nextLine();
	                System.out.println("Stage event:" + tb.getStageEvent());
	    	        System.out.println("Customer:" + tb.getCustomer());
	    	        System.out.println("Number of seats:" + tb.getNoOfSeats());
	                tb.makePayment(cardAmount, cardType, ccv);
	                break;

	            default:
	                System.out.println("Invalid choice");
	                break;
	        }

	        sc.close();
	}

}

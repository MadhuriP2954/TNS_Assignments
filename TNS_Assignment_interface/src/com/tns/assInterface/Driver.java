package com.tns.assInterface;
import java.util.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        // Read choice
        int choice = scanner.nextInt();
        // Read hours of travel
        int hours = scanner.nextInt();
        // Read cost per hour
        double costPerHour = scanner.nextDouble();
        
        Airfare airfare = null;
        switch (choice) {
        case 1:
            airfare = new AirIndia(hours, costPerHour);
            break;
        case 2:
            airfare = new KingFisher(hours, costPerHour);
            break;
        case 3:
            airfare = new Indigo(hours, costPerHour);
            break;
        default:
            System.out.println("Invalid choice");
            return;
    }
    // Display the total amount
    airfare.display();
    
    scanner.close();

	}

}

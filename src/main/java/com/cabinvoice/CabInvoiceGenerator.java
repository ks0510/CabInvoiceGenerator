package com.cabinvoice;

public class CabInvoiceGenerator {
	public static final double costperKm = 10.0;
	public static final double costpermin = 1.0;
	public static final double min_fare = 5.0;
	private double totalFare; // Instance variable to store the total fare for all rides

	public double calculateFare(double distance,int time) {
		double rideFare = (costperKm * distance) + (costpermin * time);
		// Calculate fare for an individual ride
		if(totalFare<5) {
			return min_fare;
		}
		return totalFare;
	}


	public void calculateTotalFare(Ride[] rides) {
		totalFare = 0;   // Initialize the total fare to zero

		for (Ride ride : rides) {
			totalFare += calculateFare(ride.distance, ride.time);
			// Calculate fare for each ride and accumulate the total fare
		}
	}
	public double getTotalFare() {
		return totalFare;   // Return the total fare for all rides
	}
}

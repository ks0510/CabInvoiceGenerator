package com.cabinvoice;

import java.util.Scanner;

public class CabInvoiceGenerator {
	Scanner sc = new Scanner(System.in);

	public static final double costperKm = 10.0;
	public static final double costpermin = 1.0;
	public static final double min_fare = 5.0;
	private double totalFare; // Instance variable to store the total fare for all rides

	public double calculateFare(double distance, int time) {
		double rideFare = (costperKm * distance) + (costpermin * time);
		// Calculate fare for an individual ride
		if (totalFare < 5) {
			return min_fare;
		}
		return totalFare;
	}

	public double calculateTotalFare(double[] distance, int[] time) {
		double totalFare = 0;   // Initialize the total fare to zero

		for (int i=0;i<distance.length;i++) {
			totalFare += calculateFare(distance[i],time[i]);
			// Calculate fare for each ride and accumulate the total fare
		}
	    return totalFare;// Return the total fare for all rides
	}
	/*
	 * This function return the total number of ride
	 */
	public int numberofRides(double[] distance) {
		double totalFare = 0;   // Initialize the total fare to zero
		return  distance.length;
	}
	
	/*
	 * This method will return average of total fares
	 */
	public double calculateAverage(double[] distance,int[] time) {
		double totalFare = 0;   // Initialize the total fare to zero

		for (int i=0;i<distance.length;i++) {
			totalFare += calculateFare(distance[i],time[i]);
			// Calculate fare for each ride and accumulate the total fare
		}
		/*
		 * To return average of total fare
		 */
		return (totalFare/distance.length);
	}

	public double rideRepository(double [] array,int Id ){
		return array[Id-1];// should return user id invoice
	}
}

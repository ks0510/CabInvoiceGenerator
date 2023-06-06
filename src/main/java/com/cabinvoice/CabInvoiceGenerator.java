package com.cabinvoice;

import java.util.Scanner;

public class CabInvoiceGenerator {
	Scanner sc = new Scanner(System.in);

	public static final double costperKm = 10.0;
	public static final double costpermin = 1.0;
	public static final double min_fare = 5.0;
	public static final double premium_min_fare = 20.0;
	

	public double calculateFare(double distance, int time) {
		double rideFare = (costperKm * distance) + (costpermin * time);
		// Calculate fare for an individual ride
		if (rideFare < 5) {
			return min_fare;
		}
		return rideFare;
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
	public int calculateAverage(double[] distance,int[] time) {
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
	/*
	 * To define method which return invoice if we enter user id
	 * from ride repo
	 */
	public double rideRepository(double [] array,int Id ){
		return array[Id-1];// should return user id invoice
	}
	
	/*
	 * To define  method premium ride invoice
	 */
	public double calculatePremiumFare(double distance, int time) {
		double rideFare = (15*distance) + (2*time);
		// Calculate fare for an individual ride
		if (rideFare < 20) {
			return premium_min_fare ;
		}
		return rideFare;
	}

	/*
	 * To define method which give invoice for premium ride and normal ride also
	 */
	public double calFare(double distance, int time,int choice) {
		double fare;
		if(choice==1) {
			fare = calculateFare(distance,time);
		}
		else if(choice==2) {
			fare = calculatePremiumFare(distance,time);
		}
	}
}

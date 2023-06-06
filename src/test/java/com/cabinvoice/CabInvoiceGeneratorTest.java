package com.cabinvoice;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CabInvoiceGeneratorTest {
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

    @Test
    public void givenDistance_shouldReturnFare() {
        double distance = 2;
        int time = 5;
        double result = cabInvoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(25.00, result);
    }

    @Test
    public void givenDistance_shouldReturnTotalFare() {
        double[] distance = new double[]{2.0, 3.0, 5.0};
        int[] time = new int[]{5, 10, 15};
        double result = cabInvoiceGenerator.calculateTotalFare(distance,time);
        Assertions.assertEquals(130, result);
    }
    @Test
    public void numberofRides_ShouldReturnTotalNumberOfRide(){
        double[] distance = new double[]{2.0, 3.0, 5.0};

        int numberOfRides = cabInvoiceGenerator.numberofRides(distance);
        Assertions.assertEquals(3,numberOfRides);
    }
    @Test
    public void calculateAverage_ShouldReturnAverageFare(){
        double[] distance = new double[]{2.0, 3.0, 5.0};
        int[] time = new int[]{5, 10, 15};
        int  averageFare = cabInvoiceGenerator.calculateAverage(distance,time);
        Assertions.assertEquals((130/3),averageFare);
    }
    
    @Test
    public void rideRepository_ShouldReturnInvoice() {
    	/*
    	 * This is invoice of every user id stored in array
    	 */
    	double rideRepo = new double {65.0,40.0,35.0};
    	int userId = 2;
    	double invoice = cabInvoiceGenerator.rideRepository(rideRepo,userId);
    	Assertions.assertEquals(40.0,invoice);
    	
    }
}


package com.cabinvoice;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CabInvoiceGeneratorTest{
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
    @Test
public void givenDistance_shouldReturnFare(){
    double distance = 2;
    int time = 5;
    double result = cabInvoiceGenerator.calculateFare(distance,time);
    Assertions.assertEquals(25.00,result);
    }
}


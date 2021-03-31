package com.valuemomentum.training.bank.testing.Junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuitTest1 {
	
	public String message = "Raj";							

    JUnitMessage junitMessage = new JUnitMessage(message);							

    @Test			
    public void testJUnitMessage() {					

        System.out.println("Junit Message is printing ");					
        junitMessage.printMessage();			

    }		

    @Test		
    public void testJUnitHiMessage() {					
        message = "Hi " + message;							
        System.out.println("Junit Hi Message is printing ");					
        assertEquals(message, junitMessage.printHiMessage());					
        System.out.println("Suite Test 1 is successful " + message);	

}}



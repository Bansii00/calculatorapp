package com.miit.calculatorapp.calculatorapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	
	
	
	
	Calculator cal = new Calculator();
	@Test
	public void test() {
		int num1 = 40;
		int num2 = 60;
		assertEquals(100, cal.add(num1, num2));
		
	}

	
		
	}



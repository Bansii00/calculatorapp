package com.miit.calculatorapp.calculatorapp;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class CalculatorTestdivision {

	
	
	
	Calculator cal = new Calculator();
	@Test
	public void test() {
		int num1 = 60;
		int num2 = 15;
		assertEquals(4, cal.div(num1, num2));
		
	}

	
		
	}



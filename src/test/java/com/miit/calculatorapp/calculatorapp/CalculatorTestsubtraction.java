package com.miit.calculatorapp.calculatorapp;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class CalculatorTestsubtraction {

	
	
	
	Calculator cal = new Calculator();
	@Test
	public void test() {
		int num1 = 100;
		int num2 = 60;
		assertEquals(40, cal.sub(num1, num2));
		
	}

	
		
	}



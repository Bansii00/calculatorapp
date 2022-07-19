package com.miit.calculatorapp.calculatorapp;



import java.util.Scanner;
public class CalculatorApp {

	public static void main(String[] args) {
	

		char operation;
		Double num1, num2, O;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();
        
        
        System.out.println("Select operation");

        System.out.println("Addition-+");
        System.out.println("Subtraction--");
        System.out.println("Multiplication");
        System.out.println("Division-/");
        char ch = scanner.next().charAt(0);
        
        
        
        
        switch (ch) {

        // performs addition between numbers
        case '+':
          O = num1 + num2;
          System.out.println(num1 + " + " + num2 + " = " + O);
          break;

        // performs subtraction between numbers
        case '-':
          O = num1 - num2;
          System.out.println(num1 + " - " + num2 + " = " + O);
          break;
          
       // performs multiplication between numbers
        case '*':
          O = num1 * num2;
          System.out.println(num1 + " * " + num2 + " = " + O);
          break;

        // performs division between numbers
        case '/':
          O = num1 / num2;
          System.out.println(num1 + " / " + num2 + " = " + O);
          break;
        
        default:
            System.out.println("Invalid operator!");
           
        }


     
          
          
          
        }
        
       

	}


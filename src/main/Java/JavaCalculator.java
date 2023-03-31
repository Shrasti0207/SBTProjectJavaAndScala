package com.knoldus;

public class JavaCalculator {
    // method to add two numbers
    public int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    // method to subtract to numbers
    public int subtract(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    // method to multiply two numbers
    public int multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

    // method to divide two numbers
    public int divide(int numberOne, int numberTwo) {
        // throw exception if number divide by zero
        int resultOfDivision = 0;
        try {
            resultOfDivision = numberOne / numberTwo;
        } catch (ArithmeticException e) {
            System.out.println("divide by zero is not valid");
        }
        return resultOfDivision;
    }
}

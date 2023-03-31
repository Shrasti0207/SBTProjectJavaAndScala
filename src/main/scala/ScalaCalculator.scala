package com.knoldus

package com.knoldus
// Import the JavaCalculator class
class ScalaCalculator {
  private val scalaCalculator = new JavaCalculator

  // adding two numbers using javaCalculator
  def add(numberOne: Int, numberTwo: Int): Int = scalaCalculator.add(numberOne, numberTwo)

  // subtract two numbers using the JavaCalculator
  def subtract(numberOne: Int, numberTwo: Int): Int = scalaCalculator.subtract(numberOne, numberTwo)

  // multiply two numbers using the JavaCalculator
  def multiply(numberOne: Int, numberTwo: Int): Int = scalaCalculator.multiply(numberOne, numberTwo)

  // Define a method to divide two numbers using the JavaCalculator
  def divide(numberOne: Int, numberTwo: Int): Int = scalaCalculator.divide(numberOne, numberTwo)
}
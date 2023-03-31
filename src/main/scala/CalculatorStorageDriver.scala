package com.knoldus

object CalculatorStorageDriver extends App {
  // Create an instance of the JavaCalculator class
  private val calculator = new JavaCalculator

  // Perform some calculations using the JavaCalculator and print the results
  println(calculator.add(23, 34))
  println(calculator.subtract(10, 5))
  println(calculator.multiply(5, 4))
  println(calculator.divide(5, 2))
  // Attempt to divide by zero using the JavaCalculator and print the result
  println(calculator.divide(5, 0))

  // Create an instance of the StorageScala class
  private val storage = new StorageScala
  // Add some elements to the storage
  storage.addElement(10)
  storage.addElement(20)
  storage.addElement(30)
  storage.addElement(40)

  // Check if an element is present in the storage and print the result
  println(storage.checkIfContains(30))

  // Remove some elements from the storage
  storage.removeElement(10)
  storage.removeElement(20)
  println(storage.checkIfContains(10))
  println(storage.checkIfContains(40))

  // Remove all elements from the storage
  storage.removeAll()
}


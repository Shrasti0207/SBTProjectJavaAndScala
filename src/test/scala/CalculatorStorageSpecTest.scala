package com.knoldus

import org.scalatest.funsuite.AnyFunSuite
class CalculatorStorageSpecTest extends AnyFunSuite {
  val calculator = new JavaCalculator
  val storage = new StorageScala

  test("Calculator should add two numbers correctly") {
    assert(calculator.add(1, 2) == 3)
  }

  test("Calculator should subtract two numbers correctly") {
    assert(calculator.subtract(5, 2) == 3)
  }

  test("Calculator should multiply two numbers correctly") {
    assert(calculator.multiply(3, 4) == 12)
  }

  test("Calculator should divide two numbers correctly") {
    assert(calculator.divide(10, 2) == 5)
  }

  test("Storage should contain added elements") {
    storage.addElement(10)
    storage.addElement(20)
    assert(storage.checkIfContains(10))
    assert(storage.checkIfContains(20))
  }

  test("Storage should remove elements correctly") {
    val storage = new StorageScala
    storage.addElement(10)
    storage.addElement(20)
    storage.addElement(30)
    storage.removeElement(20)
    assert(!storage.checkIfContains(20))
    storage.removeElement(10)
    assert(!storage.checkIfContains(10))
  }
}

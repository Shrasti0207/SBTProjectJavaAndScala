package com.knoldus

trait StorageOperations {
  // Method to add a number  to the storage
  def addElement(number: Int): Unit

  // Method to remove a number from the storage
  def removeElement(number: Int): Unit

  // Method to remove all numbers from the storage
  def removeAll(): Unit

  // Method to check if the storage contains a given number or not
  def checkIfContains(number: Int): Boolean
}

class StorageScala extends StorageOperations {
  private val scalaStorage = new JavaStorage

  // add the number using javaStorage
  override def addElement(number: Int): Unit = scalaStorage.addElement(number)

  // remove the number using javaStorage
  override def removeElement(number: Int): Unit = scalaStorage.removeElement(number)

  // remove all the numbers from the java storage
  override def removeAll(): Unit = scalaStorage.removeAll()

  // check that the number is exist or not in the list
  override def checkIfContains(number: Int): Boolean = scalaStorage.checkIfContains(number)
}
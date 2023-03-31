package com.knoldus;
import java.util.ArrayList;
import java.util.List;

public class JavaStorage {
    // Initialize a private List of Integer objects
    private final List<Integer> numbers = new ArrayList<Integer>();
    // method addElement is to add the element in to the list
    public void addElement(int number) {
        numbers.add(number);
    }
    // method removeElement is to remove the element from the list
    public void removeElement(int number) {
        numbers.remove(Integer.valueOf(number));
    }
    // removeAll method is to remove all the elements from the list
    public void removeAll() {
        numbers.clear();
    }
    // checkIfContains method is to check the number that it exist or not in the list
    public boolean checkIfContains(int number) {
        return numbers.contains(number);
    }
}
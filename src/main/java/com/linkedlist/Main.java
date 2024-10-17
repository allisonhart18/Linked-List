package com.linkedlist;

public class Main {
    public static void main(String[] args) {
        GroceryLinkedList groceryList = new GroceryLinkedList();

        // Test 1
        System.out.println("Test 1");
        groceryList.insertAtEnd(new FoodNode("milk"));
        groceryList.insertAtEnd(new FoodNode("bananas"));
        groceryList.insertAtEnd(new FoodNode("ice cream"));
        groceryList.insertAtEnd(new FoodNode("spinach"));
        groceryList.insertAtEnd(new FoodNode("chicken"));
        groceryList.print(); // Expected: milk bananas ice cream spinach chicken

         // Test 2
         System.out.println("\nTest 2");
         groceryList.remove("ice cream");
         groceryList.print(); // Expected: milk bananas spinach chicken
         
         // Test 3
         System.out.println("\nTest 3");
         groceryList.remove("chicken");
         groceryList.print(); // Expected: milk bananas spinach
         
         // Test 4
         System.out.println("\nTest 4");
         int spinachIndex = groceryList.find("spinach");
         if (spinachIndex != -1) {
             System.out.println("Spinach is number " + spinachIndex + " in the grocery list.");
         } else {
             groceryList.insertAtEnd(new FoodNode("spinach"));
         }
         groceryList.print(); // Expected: milk bananas spinach
         
         // Test 5
         System.out.println("\nTest 5");
         int eggsIndex = groceryList.find("eggs");
         if (eggsIndex != -1) {
             System.out.println("Eggs are number " + eggsIndex + " in the grocery list.");
         } else {
             groceryList.insertAtEnd(new FoodNode("eggs"));
         }
         groceryList.print(); // Expected: milk bananas spinach eggs
         
         // Test 6
         System.out.println("\nTest 6");
         groceryList.insertAtStart(new FoodNode("onions"));
         groceryList.print(); // Expected: onions milk bananas spinach eggs
         
         // Test 7
         System.out.println("\nTest 7");
         groceryList.insert("bananas", new FoodNode("strawberries"));
         groceryList.print(); // Expected: onions milk bananas strawberries spinach eggs
    }
}
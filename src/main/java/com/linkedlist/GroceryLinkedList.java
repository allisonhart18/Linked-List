/*
 * Coder - Allison Hart 
 * Date 10/17/2024
 * Description - single linked list - each foodnode contains a food name
 * andreference to the next node
 * This class allows for node to be added, searched, and removed
 * and seeing if a list is empty or at the end
 * 
 */


package com.linkedlist;

public class GroceryLinkedList {

     FoodNode head;
     int index;

    //constructor
     public GroceryLinkedList(){
        this.head = null;
     }


     //printed list that goes through each node
public void print(){
    if (isEmpty() == true){
        System.out.println("The list is empty :(");
    }
    else{
        FoodNode current = head;
        while( current != null){
            System.out.println(current.getFoodName() + " ");
            current = current.getNextFood();
        }

        System.out.println();

    }

}

//inserts node at a specific index in linked list
//if index is 0 the node is inserted at the start using insertAtStart method
//prints error message if out of bounds
void insert(int index, FoodNode node){
    //FoodNode at indicated index
    if(index == 0) {
        insertAtStart(node);

    }
    else{
        FoodNode current = head;
        int count = 0;

        while(current != null && count < index -1) {
            current = current.getNextFood();
            count++;
        }

        if(current != null){
            node.setNextFood(current.getNextFood());
            current.setNextFood(node);
        }

        else{
            System.out.println("Index is out of bounds");

        }

    }

}


//inserts a node after specified food item in list
//uses find method to locate index of node with food
//prints message if food is not found
void insert(String food, FoodNode node){
    // insert a food after another specified food
    int index = find(food);
    if(index != -1){
        insert(index +1, node);
    }
    else{
        System.out.println(food + "not found in the list");
    }

}    



// insterts a node at the start/beginning of linked list
void insertAtStart(FoodNode node){
    // FoodNode at start of list - prepend

    node.setNextFood(head);
    head = node;

}

//insterts a node at the end of the linked list
//if list is empty the new node becomes the head

void insertAtEnd(FoodNode node){
     // FoodNode at the end of the list
    if(isEmpty()){
        head = node;
    } else{
        FoodNode current = head;
        while(current.getNextFood() != null){
            current = current.getNextFood();
        }

        current.setNextFood(node);
    }

}

//checks if list is empty
//returns true if head is null, returns false if not
public boolean isEmpty() {
    return head == null;
}
    //return whether list is empty


    //finds the index of a node with the specified food item in list
    public int find (String food)
    {
        FoodNode current = head;
        int index = 0;

        while(current != null){
            if(current.getFoodName().equalsIgnoreCase(food)){
             return index;             
            }
            current = current.getNextFood();
            index++;

        }
        return -1;
    }

//removes a node witht the specified food item from list
//if list is empty a message is printed, if the head contains the specified food it updates to the next node
//if the food is found it removes th enode by updating the next pointer and prev node to skip over the removed node
void remove(String food){
    //remove the specified food
    if(isEmpty()){
        System.out.println("The list is empty");
        return;
    }
    if(head.getFoodName().equalsIgnoreCase(food)) {
        head = head.getNextFood();
    } else {
        FoodNode current = head;
        FoodNode previous = null;

        while(current != null && !current.getFoodName().equalsIgnoreCase(food)) {
            previous = current;
            current = current.getNextFood();

        }

        if(current != null) {
            previous.setNextFood(current.getNextFood());
        
        } else {
            System.out.println(food + "not found in the list");
        }

    }

}

}

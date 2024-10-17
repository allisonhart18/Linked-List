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




void insertAtStart(FoodNode node){
    // FoodNode at start of list - prepend

    node.setNextFood(head);
    head = node;

}

void insertAtEnd(FoodNode node){
     // FoodNode at the en of the list
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

public boolean isEmpty() {
    return head == null;
}
    //return whether list is empty

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

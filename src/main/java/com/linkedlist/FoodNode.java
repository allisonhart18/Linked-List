package com.linkedlist;

public class FoodNode {

    String foodName;
    FoodNode nextFood;
    

public FoodNode(String foodName){
    this.foodName = foodName;
    this.nextFood = null;
   
}

public String getFoodName(){
return foodName;

}

public void setFoodName(String foodName){
    this.foodName = foodName;
}

public FoodNode getNextFood(){

    return nextFood;
}

public void setNextFood(FoodNode nextFood){
this.nextFood = nextFood;

}



}
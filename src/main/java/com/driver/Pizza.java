package com.driver;
import java.util.*;
public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";

    boolean isCheese;
    boolean isToppings;
    boolean isTakeway;
    private String array[]=new String[]{"","","",""};


    int vegPizzaBasePrice = 300;
    int nonvegPizzaBasePrice = 400;
    int extraCheesePrice = 80;
    int extraToppingsForVegPizza = 70;
    int extraToppingsForNonvegPizza = 120;
    int paperBagPrice = 20;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            array[0]=array[0]+"Base Price Of The Pizza: "+vegPizzaBasePrice+"\n";
            this.price=this.price+vegPizzaBasePrice;
        }else{
            array[0]=array[0]+"Base Price Of The Pizza: "+nonvegPizzaBasePrice+"\n";
            this.price=this.price+nonvegPizzaBasePrice;
        }
    }

    public int getPrice(){
//        if(this.dp){
//            if(this.isVeg){
//                this.price=this.price+extraCheesePrice+extraToppingsForVegPizza;
//
//            }else{
//                this.price=this.price+extraCheesePrice+extraToppingsForNonvegPizza;
//            }
//            this.dp=false;
//
//        }

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isCheese){
            array[1]=array[1]+"Extra Cheese Added: "+extraCheesePrice+"\n";
            this.price=this.price+extraCheesePrice;
            isCheese=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(!isToppings){
            if(this.isVeg){
                array[2]=array[2]+"Extra Toppings Added: "+extraToppingsForVegPizza+"\n";
                this.price=this.price+extraToppingsForVegPizza;
            }else{
                array[2]=array[2]+"Extra Toppings Added: "+extraToppingsForNonvegPizza+"\n";
                this.price=this.price+extraToppingsForNonvegPizza;
            }
            isToppings=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!isTakeway){
            array[3]=array[3]+"Paperbag Added: "+paperBagPrice+"\n";
            this.price=this.price+paperBagPrice;
            isTakeway=true;
        }
    }

    public String getBill(){
        // your code goes here
//        if(this.dp) {
//            if (this.isVeg) {
//                this.bill = this.bill + "Extra Cheese Added: " + extraCheesePrice + "\n" + "Extra Toppings Added: " + extraToppingsForVegPizza + "\n";
//            } else {
//                this.bill = this.bill + "Extra Cheese Added: " + extraCheesePrice + "\n" + "Extra Toppings Added: " + extraToppingsForNonvegPizza + "\n";
//            }
//            this.dp = false;
//            isBase = true;
//            isCheese = true;
//            isToppings = true;
//
//        }
        for(int i=0;i<array.length; i++){
            this.bill=this.bill+array[i];
        }
        this.bill=this.bill+"Total Price :"+this.price;
        return this.bill;
    }
}

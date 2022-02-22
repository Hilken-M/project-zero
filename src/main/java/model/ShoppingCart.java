package model;

import MyCollection.ArrayList;

public class ShoppingCart {

    private int totalCost = 0;
    ArrayList<Grocery> cart = new ArrayList<>();


    public ShoppingCart(){
        // TODO document why this constructor is empty
    }

    public void addToCart(Grocery g, int quant){
        if(cart.contains(g)){
            //if its there, update quantity
        } else {
            cart.add( new Grocery(
                    g.getProductcode(),
                    g.getItem_name(),
                    g.getPrice(),
                    quant)
            );
        }
    }

    public void printCart(){
        for (int i = 0; i < cart.length ; i++) {
            System.out.println(cart.getIndex(i).toString());
        }
    }

    public int getTotalCost(){
        return totalCost;
        //method will likely multiply each item, by quantity selected for all products in a cart
    }
}
// see line 226 on in Menu for BankApp for For loop logic
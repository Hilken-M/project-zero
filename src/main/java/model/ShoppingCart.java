package model;

public class ShoppingCart {

    private int totalCost = 0;
    ShoppingCart cart1 = new ShoppingCart();
    ShoppingCart cart2 = new ShoppingCart();

    public ShoppingCart(){
        // TODO document why this constructor is empty
    }

    public void fillCart(){
        //method to add items into my arraylist collection we will call cart
    }

    public String printCart(){
        return null;
    }

    public int getTotalCost(){
        return totalCost;
        //method will likely multiply each item, by quantity selected for all products in a cart
    }
}

package model;

import myCollection.ArrayList;


public class ShoppingCart {



    private int quantity;
    private double totalCost = 0;
    ArrayList<Grocery> cart = new ArrayList<>();


    public ShoppingCart(){
        // TODO document why this constructor is empty
    }

    public void addToCart(Grocery g, int quant){
       // Object[] data;
        int i = cart.returnIndex(g);
        if(i != -1){
            Grocery p = (Grocery) cart.getIndex(i);
            int currentQuant = p.getQuantity();
            p.setQuantity(quant+currentQuant);
        } else {
            cart.add( new Grocery(
                    g.getProductCode(),
                    g.getItemName(),
                    g.getPrice(),
                    quant));
        }
        quantity += quant;
    }

    public void sumCost(){
        for(int i = 0; i < cart.length; i++){
            Grocery g = (Grocery) cart.getIndex(i);
            totalCost += g.getPrice() * g.getQuantity();
        }
    }

    public void printCart(){
        for (int i = 0; i < cart.length ; i++) {
            System.out.println(cart.getIndex(i).toString());
        }
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
// see line 226 on in Menu for BankApp for For loop logic
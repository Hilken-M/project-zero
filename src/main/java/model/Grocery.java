package model;

import java.util.Objects;

public class Grocery {
    
    private int productcode;
    private String item_name;
    private double price;
    private int quantity;

    //keep track of groceries selected by customer

    public Grocery(int productcode, String item_name, double price, int quantity){
        this.productcode = productcode;
        this.item_name = item_name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public int getProductcode() {
        return productcode;
    }

    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }

    public String getItem_name(){
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    @Override
    public String toString(){
        return "Grocery Selected{" +
                "product= " + item_name +
                ", price= $" + price +
                ", quantity= " + quantity +
                //", quantity= " + quantity + // I need to add a quantity column and tracker (possibly ProductCode and Description)
                '}';
    }
    
//    @Override
//    public boolean equals(Object 0){
//        if (this = o) return true;
//        if (o = null || getClass() != o.getClass()) return false;
//        Grocery grocery = (Grocery) 0;
//        return productcode == grocery.productcode && item_name == grocery.item_name && price == grocery.price && quantity == grocery.quantity;
//    }

    @Override
    public int hashCode() {return Objects.hash(productcode, item_name, price, quantity);}


}


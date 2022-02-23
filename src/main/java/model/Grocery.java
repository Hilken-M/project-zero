package model;

import java.util.Objects;

public class Grocery {
    
    private int productcode;
    private String itemname;
    private double price;
    private int quantity;

    public Grocery(int productcode, String itemname, double price, int quantity){
        this.productcode = productcode;
        this.itemname = itemname;
        this.price = price;
        this.quantity = quantity;
    }
    
    public int getProductCode() {
        return productcode;
    }

    public void setProductCode(int productcode) {
        this.productcode = productcode;
    }

    public String getItemName(){
        return itemname;
    }

    public void setItemName(String itemname) {
        this.itemname = itemname;
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
                "product= " + itemname +
                ", price= $" + price +
                ", quantity= " + quantity +
                '}';
    }

    public boolean equals(Grocery grocery){
        if (grocery == null || getClass() != grocery.getClass()) return false;
        return productcode == grocery.productcode && itemname.equals(grocery.itemname);
    }

    @Override
    public int hashCode() {return Objects.hash(productcode, itemname, price, quantity);}


}


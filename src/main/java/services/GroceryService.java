package services;


import dao.GroceryDAO;
import model.Grocery;

import java.sql.SQLException;

public class GroceryService {
    //This will be where I will place a lot of my connection checks, and updates/removals from db

    GroceryDAO grocerydao;

    public GroceryService(){grocerydao = new GroceryDAO();}
    public GroceryService(GroceryDAO dao){ grocerydao = dao;}

    public boolean addGrocery(int id, String name, double price){
        if(id<0){
            return false;
        }
        try{
            Grocery g = new Grocery(id, name, price);
            grocerydao.addGrocery(g);
            return true;
        } catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    public Grocery getGrocery(String userInput){
        if(userInput.length()<= 0){
            return null;
        }
        try{
            return grocerydao.getGrocery(userInput);
        } catch(SQLException e){
            return null;
        }
    }

}

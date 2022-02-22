package driver;

//import model.Menu;
import model.Menu;
import services.GroceryService;
import utilities.ConnectionUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Driver {
    public static Connection conn = ConnectionUtil.getConnection();
    public static void main(String[] args) throws SQLException {

        GroceryService groceryService = new GroceryService();

        conn.setAutoCommit(true);


        //System.out.println(groceryService.getGrocery("Toilet Paper"));
        //groceryService.addGrocery( 3, "Power Ranger", 7.99, 10);

           Menu myMenu = new Menu();
           myMenu.runMenu();



    }
}

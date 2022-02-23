package driver;

//import model.Menu;
import model.Menu;
import org.apache.log4j.LogMF;
import services.GroceryService;
import utilities.ConnectionUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.SQLException;



public class Driver {
    

    public static Connection conn = ConnectionUtil.getConnection();

    public static Logger log = Logger.getLogger(Driver.class);

    public static void main(String[] args) throws SQLException {
        Logger log = Logger.getLogger(Driver.class);
        log.info("Hello logger!");

        GroceryService groceryService = new GroceryService();
        conn.setAutoCommit(true);

           Menu myMenu = new Menu();
           myMenu.runMenu();



    }
}

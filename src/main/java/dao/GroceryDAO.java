package dao;

import myCollection.ArrayList;
import model.Grocery;
import utilities.ConnectionUtil;

import java.sql.*;

public class GroceryDAO {


    Connection conn;
    public GroceryDAO() { conn = ConnectionUtil.getConnection();}
    public GroceryDAO(Connection conn) {this.conn = conn;}
    public ArrayList<Grocery> getGroceryList() {return null;}

    public Grocery getGrocery(String choice) throws SQLException{
        Grocery myGrocery = null;
        PreparedStatement statement = conn.prepareStatement("Select * From Products Where ItemName =?");
        int parameterIndex = 0;
        statement.setString(++parameterIndex, choice);

        ResultSet rs = statement.executeQuery();

        while (rs.next()){
            myGrocery = new Grocery(rs.getInt("ProductCode"),
                rs.getString("ItemName"),
                rs.getDouble("Price"),
                rs.getInt( "Quantity"));
        }
        rs.close();
        return myGrocery;
    }

        public void createGrocery(Grocery G) throws SQLException{
            PreparedStatement statement = conn.prepareStatement(
                    "Insert into Products (ProductCode, ItemName, Price, Quantity)" + "Values"
                    + "(?,?,?,?)");
            int parameterIndex = 0;
            statement.setInt(++parameterIndex, G.getProductCode());
            statement.setString(++parameterIndex, G.getItemName());
            statement.setDouble(++parameterIndex, G.getPrice());
            statement.setInt(++parameterIndex, G.getQuantity());
            statement.executeUpdate();
        }



        public void update(Grocery Y) throws SQLException {
            PreparedStatement statement = conn.prepareStatement(
                    "Insert into Products (ProductCode, ItemName, Price, Quantity)" + "Values"
                            + "(?,?,?,?)");
            int parameterIndex = 0;
            statement.setInt(++parameterIndex, Y.getProductCode());
            statement.setString(++parameterIndex, Y.getItemName());
            statement.setDouble(++parameterIndex, Y.getPrice());
            statement.setInt(++parameterIndex, Y.getQuantity());
            statement.executeUpdate();
        }

        public void delete(Grocery Z) throws SQLException {
         //implement delete method
        }




}

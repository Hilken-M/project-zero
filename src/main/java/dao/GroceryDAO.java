package dao;

import MyCollection.ArrayList;
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
        PreparedStatement statement = conn.prepareStatement("Select * From Products Where item_name =?");
        int parameterIndex = 0;
        statement.setString(++parameterIndex, choice);

        ResultSet rs = statement.executeQuery();

        while (rs.next()){
            myGrocery = new Grocery(rs.getInt("ProductCode"),
                rs.getString("item_name"),
                rs.getDouble("Price"),
                rs.getInt( "Quantity"));
        }
        rs.close();
        return myGrocery;
    }

        public void addGrocery(Grocery G) throws SQLException{
            PreparedStatement statement = conn.prepareStatement(
                    "Insert into Products (ProductCode, item_name, Price, Quantity)" + "Values"
                    + "(?,?,?,?)");
            int parameterIndex = 0;
            statement.setInt(++parameterIndex, G.getProductcode());
            statement.setString(++parameterIndex, G.getItem_name());
            statement.setDouble(++parameterIndex, G.getPrice());
            statement.setInt(++parameterIndex, G.getQuantity());
            statement.executeUpdate();
        }



//        public void update(Grocery Y) throws SQLException {
//            PreparedStatement statement = conn.prepareStatement(
//                    "Insert into Products (ProductCode, item_name, Price, Quantity)" + "Values"
//                            + "(?,?,?,?)");
//            int parameterIndex = 0;
//            statement.setInt(++parameterIndex, Y.getProductcode());
//            statement.setString(++parameterIndex, Y.getItem_name());
//            statement.setDouble(++parameterIndex, Y.getPrice());
//            statement.setInt(++parameterIndex, Y.getQuantity());
//            statement.executeUpdate();
//        }
//
//        public void delete(Grocery Z) throws SQLException {
//         //implement delete method
//        }
//



}

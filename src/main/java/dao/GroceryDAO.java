package dao;

import model.Grocery;
import utilities.ConnectionUtil;

import java.sql.*;
import java.util.List;

public class GroceryDAO {


    Connection conn;
    public GroceryDAO() { conn = ConnectionUtil.getConnection();}
    public GroceryDAO(Connection conn) {this.conn = conn;}
    public List<Grocery> getGroceryList() {return null;}

    public Grocery getGrocery(String item_name) throws SQLException{
        Grocery myGrocery = null;
        PreparedStatement statement = conn.prepareStatement("Select * From Products Where item_name =?");
        int parameterIndex = 0;
        statement.setString(++parameterIndex, item_name);

        ResultSet rs = statement.executeQuery();

        while (rs.next()){
            myGrocery = new Grocery(rs.getInt("ProductCode"),
                rs.getString("item_name"),
                rs.getInt("Price"));
        }
        rs.close();
        return myGrocery;
    }

        public void addGrocery(Grocery G) throws SQLException{
            PreparedStatement statement = conn.prepareStatement(
                    "Insert into Products (ProductCode, item_name, Price)" + "Values"
                    + "(?,?,?)");
            int parameterIndex = 0;
            statement.setInt(++parameterIndex, G.getProductcode());
            statement.setString(++parameterIndex, G.getItem_name());
            statement.setDouble(++parameterIndex, G.getPrice());
            statement.executeUpdate();
        }



}

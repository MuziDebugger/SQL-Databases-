package com.udemy.database;
import java.sql.*;
public class Datasource {

    public static final String DB_NAME = "Myclients.db";

    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\Muzi\\Documents\\Database\\Myclients" + DB_NAME;
// "jdbc:sqlite:C:\\Users\\Muzi\\Documents\\Database\\MyClients\\Myclients.db"

    //    statement.execute("INSERT INTO W3clients (customer_ID, customerName, Address, City, Country) "
    //	  + "VALUES(01, 'Alfred Anders', '57 Obere Street', 'Berlin', 'Germany')");
	           
    public static final String TABLE_W3Clients = "Myclients";
    public static final String COLUMN_CUSTOMER_ID = "customer_ID";
    public static final String COLUMN_CUSTOMER_NAME = "customerName";
    public static final String COLUMN__ADDRESS = "Address";
    public static final String COLUMN_CITY = "City";
    public static final String COLUMN_COUNTRY = "Country";

    private Connection conn;

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch(SQLException e) {
            System.out.println("Couldn't connect to database: " + e.getMessage());
            return false;
        }
    }

    public void close() {
        try {
            if(conn != null) {
                conn.close();
            }
        } catch(SQLException e) {
            System.out.println("Couldn't close connection: " + e.getMessage());
        }
    }
}
















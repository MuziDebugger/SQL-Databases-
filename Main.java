package com.udemy.database;
import java.sql.*;
/**
 * @author Muzi Mzolo
 */
public class Main {

	public static void main(String[] args) {

      try {
          Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Muzi\\Documents\\Database\\MyClients\\Myclients.db");
         // conn.setAutoCommit(true);
          Statement statement = conn.createStatement();
          statement.execute("CREATE TABLE IF NOT EXISTS Myclients " +
                            " (customer_ID INTEGER, customerName TEXT, Address TEXT, City TEXT, Country TEXT)");
          
          
			
			  statement.
			  execute("INSERT INTO Myclients (customer_ID, customerName, Address, City, Country) "
			  + "VALUES(01, 'Alfred Anders', '57 Obere Street', 'Berlin', 'Germany')");
			           
          
          statement.execute("INSERT INTO Myclients (customer_ID, customerName, Address, City, Country) " +
                  "VALUES(02, 'Antonio Truijilo', '2222 Avda. de la Con', 'Mexico D.F', 'Mexico')");

          
          statement.execute("INSERT INTO Myclients (customer_ID, customerName, Address, City, Country) " +
                  "VALUES(03, 'Christina Berglund', '8 Berguvsvagen', 'Lulea', 'Sweden')");

          
          statement.execute("INSERT INTO Myclients (customer_ID, customerName, Address, City, Country) " +
                  "VALUES(04, 'Thomas Hardy', '120 Hanover square', 'London', 'United Kingdom')");

          
          statement.execute("INSERT INTO Myclients (customer_ID, customerName, Address, City, Country) " +
                  "VALUES(05, 'Diego Silva', '448 Madrid Lyn Street', 'Ibiza', 'Spain')");


			          
          statement.execute("SELECT * FROM Myclients");
          ResultSet results = statement.getResultSet();
          while(results.next()) {
              System.out.println(results.getInt("customer_ID") + " " +
                                 results.getString("customerName") + " " +
                                 results.getString("Address") + " " +
                                 results.getString("City") + " " +
                                 results.getString("Country")); 
          }

          results.close();

          statement.close();
          conn.close();

      } catch (SQLException e) {
          System.out.println("Something went wrong: " + e.getMessage());
      }
  }
}

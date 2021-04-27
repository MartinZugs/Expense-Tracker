package web.database;

import java.sql.*;

public class DatabaseController
{

    String jdbcUrl;
    Connection con;
    String database_name;
    Statement stmt;
    ResultSet rset;

    public DatabaseController(String database_name) 
    {
        this.database_name = database_name; 
    }


  public void set_up_database () 
  {
      
      try {
        Class.forName("com.mysql.jdbc.Driver");
      } catch(ClassNotFoundException ex) {
        System.err.println("Unable to load MySQL Driver");
      }

    try {
    String jdbcUrl = "jdbc:mysql://localhost/expense_tracker";
    Connection con = DriverManager.getConnection(jdbcUrl, "root", "");}
    catch (Exception e) {
          e.printStackTrace();
      }


  }
    
  public ResultSet execute_query (String query)
  {
      try{
      Statement stmt = con.createStatement();
      ResultSet rset = stmt.executeQuery(query);
      rset.close();
      stmt.close();
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }

      return rset;
  }
}
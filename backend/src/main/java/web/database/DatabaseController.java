package web.database;

import java.sql.*;

public class DatabaseController
{

    String jdbcUrl;
    Connection con;
    String database_name;
    Statement stmt;
    ResultSet rset;
    int affected_rows;

    public DatabaseController(String database_name) 
    {
        this.database_name = database_name; 
    }



  public void open_connection () {

    try {
      this.jdbcUrl = "jdbc:mysql://104.211.50.118/" + this.database_name;
      this.con = DriverManager.getConnection(this.jdbcUrl, "remote_user", "ZLc7PK2Ftb4k9t1P5wlp!");
    }

    catch (Exception e)
    {
      e.printStackTrace();
    }

  }

  public void close_connection () {

    try{
      this.con.close();
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }

  }

  public ResultSet execute_query (String query)
  {

      try{
        this.stmt = this.con.createStatement();
        this.rset = this.stmt.executeQuery(query);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
      
      return this.rset;
  }

  public int execute_update (String query)
  {

      try{
        this.stmt = this.con.createStatement();
        this.affected_rows = this.stmt.executeUpdate(query);
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
      
      return this.affected_rows;
  }
}
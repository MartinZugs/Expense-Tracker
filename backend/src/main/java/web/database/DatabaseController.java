/*import java.sql.*;

public class DatabaseController
{

    static {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch(ClassNotFoundException ex) {
      System.err.println("Unable to load MySQL Driver");
    }
  }

    String database_name;
    String jdbcUrl = "jdbc:mysql://localhost/" + database_name;
    Connection con = DriverManager.getConnection(jdbcUrl, "root", "");

    public DatabaseController(String database_name) 
    {
        this.database_name = database_name; 
    }

  public ResultSet execute_query (String query)
  {
      Statement stmt = con.createStatement();
      ResultSet rset = stmt.executeQuery(query);
      
      rset.close();
      stmt.close();

      return rset;
  }
}*/
// to execute this program add class path using mysql jdbc connector
// javac DisplayAuthors.java
// java -cp "mysql-jdbc-connector-5.1.43.jar:" DisplayAuthors
// TODO: Please change the user name and password on line 23


import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DisplayAuthors {
  static final String DATABASE_URL = "jdbc:mysql://localhost/books";

  public static void main(String args[]) {
    Connection con = null;
    Statement statement = null;
    ResultSet resultSet = null;

    try {
      con = DriverManager.getConnection(DATABASE_URL, username, password);
      statement = con.createStatement();
      resultSet = statement.executeQuery(
        "SELECT AuthorID, FirstName, LastName FROM authors"
      );

      ResultSetMetaData metaData = resultSet.getMetaData();
      int numberOfColumns = metaData.getColumnCount();
      System.out.println("Authors table of Books Database:\n");

      for(int i = 1; i <= numberOfColumns; i++) {
        System.out.printf("%-8s\t", metaData.getColumnName(i));
      }
      System.out.println();

      while(resultSet.next()) {
        for (int i = 1; i <= numberOfColumns; i++)
          System.out.printf("%-8s\t", resultSet.getObject(i));
        System.out.println();
      }
    }
    catch(SQLException sqlException) {
      sqlException.printStackTrace();
    }
    finally {
      try {
        resultSet.close();
        statement.close();
        con.close();
      }
      catch(Exception e) {
        e.printStackTrace();
      }
    }
  }
}

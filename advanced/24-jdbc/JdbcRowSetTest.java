// Add mysql-connector jar file in classpath. when executing this file.
// Edit username and password on lines 12 and 13.

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import com.sun.rowset.JdbcRowSetImpl;

public class JdbcRowSetTest {
  static final String DATABASE_URL = "jdbc:mysql://localhost/books";
  static final String USERNAME = "YOUR USERNAME";
  static final String PASSWORD = "YOUR PASSWORD";

  public JdbcRowSetTest () {
    try {
      JdbcRowSet rowSet = new JdbcRowSetImpl();
      rowSet.setUrl(DATABASE_URL);
      rowSet.setUsername(USERNAME);
      rowSet.setPassword(PASSWORD);

      rowSet.setCommand("SELECT * FROM authors");
      rowSet.execute();

      ResultSetMetaData metaData = rowSet.getMetaData();
      int numberOfColumns = metaData.getColumnCount();
      System.out.println("Authors Table of Books Database:\n");

      for(int i = 1; i <= numberOfColumns; i++) {
        System.out.printf("%-8s\t", metaData.getColumnName(i));
      }
      System.out.println();

      while(rowSet.next()) {
        for(int i = 1; i <= numberOfColumns; i++) {
          System.out.printf("%-8s\t", rowSet.getObject(i));
        }
        System.out.println();
      }
      rowSet.close();

    }
    catch(SQLException sqlException) {
      sqlException.printStackTrace();
      System.exit(1);
    }
  }

  public static void main(String args[]) {
    JdbcRowSetTest app = new JdbcRowSetTest();
  }
}

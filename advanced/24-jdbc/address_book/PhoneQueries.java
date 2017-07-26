import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

public class PhoneQueries {
  // TODO: Changer username, password and url of the database.
  private static final String URL = "jdbc:mysql://localhost/addressbook";
  private static final String USERNAME = "YOUR USERNAME";
  private static final String PASSWORD = "YOUR PASSWORD";

  private Connection con = null;
  private PreparedStatement selectAllPeople = null;
  private PreparedStatement selectPeopleByLastName = null;
  private PreparedStatement insertNewPerson = null;

  public PersonQueries () {
    try {
      con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

      selectAllPeople = con.prepareStatement("SELECT * FROM Addresses");

      selectPeopleByLastName = con.prepareStatement("SELECT * FROM Addresses WHERE LastName = ?");

      insertNewPerson = con.prepareStatement(
        "INSERT INTO Addresses " +
        "(FirstName, LastName, Email, PhoneNumber) " +
        "VALUES (?, ?, ?, ?)"
      );
    }
    catch(SQLException sqlException) {
      sqlException.printStackTrace();
      System.exit(1);
    }
  }

  public List<Person> getAllPeople() {
    List<Person> results = null;
    ResultSet resultSet = null;

    try {
      resultSet = selectAllPeople.executeQuery();
      results = new ArrayList<Person>();

      while(resultSet.next()) {
        results.add(new Person(
          resultSet.getInt("addressID"),
          resultSet.getString("FirstName"),
          resultSet.getString("LastName"),
          resultSet.getString("Email"),
          resultSet.getString("PhoneNumber")
        ));
      }
    }
    catch(SQLException sqlException) {
      sqlException.printStackTrace();
    }
    finally {
      try {
        resultSet.close();
      }
      catch(SQLException sqlException) {
        sqlException.printStackTrace();
        close();
      }
    }
    return results;
  }

  public List<Person> getPeopleByLastName(String name) {
    List<Person> results = null;
    ResultSet resultSet = null;

    try {
      selectPeopleByLastName.setString(1, name);

      resultSet = selectPeopleByLastName.executeQuery();
      results = new ArrayList<Person>();

      while(resultSet.next()) {
        results.add(new Person(
          resultSet.getInt("addressID"),
          resultSet.getString("FirstName"),
          resultSet.getString("LastName"),
          resultSet.getString("Email"),
          resultSet.getString("PhoneNumber")
        ));
      }
    }
    catch(SQLException sqlException) {
      sqlException.printStackTrace();
    }
    finally {
      try {
        resultSet.close();
      }
      catch(SQLException sqlException) {
        sqlException.printStackTrace();
        close();
      }
    }
    return results;
  }

  public int addPerson(String fname, String lname, String email, String num) {
    int result = 0;

    try {
      insertNewPerson.setString(1, fname);
      insertNewPseron.setString(2, lname);
      insertNewPerson.setString(3, email);
      insertNewPerson.setString(4, num);

      result = insertNewPerson.executeUpdate();
    }
    catch(SQLException sqlException) {
      sqlException.printStackTrace();
      close();
    }
    return result;
  }

  public void close() {
    try {
      con.close();
    }
    catch(SQLException sqlException) {
      sqlException.printStackTrace();
    }
  }
}

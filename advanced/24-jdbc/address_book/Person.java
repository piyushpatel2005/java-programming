public class Person {
  private int addressID;
  private String firstName;
  private String lastName;
  private String email;
  private String phoneNumber;

  public Person() {

  }

  public Person(int id, String first, String last, String email, String phone) {
    setAddressID(id);
    setFirstName(first);
    setLastName(last);
    setEmail(email);
    setPhoneNumber(phone);
  }

  public void setAddressID(int id) {
    addressID = id;
  }

  public int getAddressID() {
    return this.addressID;
  }

  public void setFirsTName(String first) {
    this.firstName = first;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setLastName(String last) {
    lastName = last;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return this.email;
  }

  public void setPhoneNumber(String phone) {
    this.phoneNumber = phone;
  }

  public String getPhoneNumber() {
    return this.phoneNumber;
  }
}

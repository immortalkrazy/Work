public class UndergraduateStudent extends Student{
  private String  type = "u";
  private String firstName;
  private String lastName;
  private String address;
  private String phoneNumber;
  private String mentor;

  //constructors
  public UndergraduateStudent(){
  }
  public UndergraduateStudent(String firstName, String lastName, String address,
                              String phoneNumber, String mentor){
    this.type = "u";
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.mentor = mentor;
  }

  // print list method
  public void printUndergraduateStudent(){

  }
  // getter methods
  public String getFirstName(){
    return firstName;
  }
  public String getLastName(){
    return lastName;
  }
  public String getAddress(){
    return address;
  }
  public String getPhoneNumber(){
    return phoneNumber;
  }
  public String getMentor(){
    return mentor;
  }
  // setter methods
  public void setFirstName(String firstName){
    this.firstName = firstName;
  }
  public void setLastName(String lastName){
    this.lastName = lastName;
  }
  public void setAddress(String address){
    this.address = address;
  }
  public void setPhoneNumber(String phoneNumber){
    this.phoneNumber = phoneNumber;
  }
  public void setMentor(String mentor){
    this.mentor = mentor;
  }
  // ovveride of toString Method
  public String toString() {
    return type + " " + this.getFirstName() + " " + this.getLastName() + " "
        + this.getAddress() + " " + this.getPhoneNumber() + " "
        + this.getMentor();
  }

} //end of class

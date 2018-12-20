public class Person implements Cloneable{
  // instance variables
  private String firstName;
  private String lastName;
  private String address;
  private String phoneNumber;
//  private String mentor;

  // default constructor
  public Person(){
  // constructor with parameters
  }
  public Person(String firstName, String lastName, String address, String phoneNumber){
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.phoneNumber = phoneNumber;
    //this.mentorName = mentorName;
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
  // public String getMentor(){
  //   return mentor;
  // }
  public String toString() {
    return "p" + " " + this.getFirstName() + " " + this.getLastName() + " "
        + this.getAddress() + " " + this.getPhoneNumber()+"\n" ;
  }

}//End of Class

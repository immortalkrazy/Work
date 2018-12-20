public class Person{
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
  // public String getMentor(){
  //   return mentor;
  // }
  public String toString() {
    return "p" + " " + this.getFirstName() + " " + this.getLastName() + " "
        + this.getAddress() + " " + this.getPhoneNumber()+"\n" ;
  }

}//End of Class

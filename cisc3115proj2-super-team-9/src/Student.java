import java.util.Scanner;
public class Student extends Person implements Mentor{

  private String type = "s";
  private String firstName;
  private String lastName;
  private String address;
  private String phoneNumber;
  private String mentor;
  // default constructor
  public Student(){
  }
  // contructor with parameters
  public Student(String firstName, String lastName, String address,
                 String phoneNumber, String mentor){
    this.type = "s";
    this.setFirstName(firstName);
    this.setLastName(lastName);
    this.setAddress(address);
    this.setPhoneNumber(phoneNumber);
    this.mentor = mentor;
  }
  // getter methods
  // public String getFirstName(){
  //   return firstName;
  // }
  // public String getLastName(){
  //   return lastName;
  // }
  // public String getAddress(){
  //   return address;
  // }
  // public String getPhoneNumber(){
  //   return phoneNumber;
  // }
  public String getMentor(){
    return mentor;
  }
  // setter methods
  // public void setFirstName(String firstName){
  //   this.firstName = firstName;
  // }
  // public void setLastName(String lastName){
  //   this.lastName = lastName;
  // }
  // public void setAddress(String address){
  //   this.address = address;
  // }
  // public void setPhoneNumber(String phoneNumber){
  //   this.phoneNumber = phoneNumber;
  // }
  public void setMentor(String mentor){
    this.mentor = mentor;
  }
  // ovveride of toString Method
  public String toString() {
    return type + " " + this.getFirstName() + " " + this.getLastName() + " "
        + this.getAddress() + " " + this.getPhoneNumber() + " "
        + this.getMentor();
  }
  //
  // public void printStudent(){
  //
  // }

  public String ping(){
    Scanner input=new Scanner(System.in);
    String message="";
    System.out.println("enter your message to be ping");
    message=input.next();
   return message;
  }

}// end of class

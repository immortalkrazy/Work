public class IndustrialMentor extends Faculty implements Mentor{

  // Putting datafields into Mentor interface
  private String type = "i";
  private String firstName;
  private String lastName;
  private String address;
  private String phoneNumber;
  private String mentee;
  // default constructor
  public IndustrialMentor(){

  }
  // constructor with arguments
  public IndustrialMentor(String firstName, String lastName, String address,
                        String phoneNumber){
    this.type = "i";
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.phoneNumber = phoneNumber;
  }

  // constructor with arguments
  public IndustrialMentor(String firstName, String lastName, String address,
                        String phoneNumber, String mentee){
    this.type = "i";
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.mentee = mentee;
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

    // override of toString method
    public String toString() {
      return type + " " + this.getFirstName() + " " + this.getLastName() + " "
          + this.getAddress() + " " + this.getPhoneNumber();
    }

}//end of class

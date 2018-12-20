import java.util.ArrayList;

public class Faculty extends Person{

  private String type = "f";
  private String firstName;
  private String lastName;
  private String address;
  private String phoneNumber;
  private ArrayList<String> listMentees;

  public Faculty(){
    listMentees = new ArrayList<String>();
  }
  public Faculty(String firstName, String lastName, String address,
                 String phoneNumber, String mentee ){
    this.type = "f";
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.phoneNumber = phoneNumber;
    listMentees.add(mentee);
   }
   //public void ping(){
     //System.out.println("PING");
   //}

   public void pingAllMentee(){
     for (int i = 0; i < listMentees.size(); i++){
       System.out.println(listMentees.get(i)+ " Ping");
     }
   }
   public void fillMenteeList(String mentee){
     //menteeList = new ArrayList<String>(MAX_MENTEE_NUM);
     listMentees.add(mentee);
   }
   public void printMenteeList(){
     for(int i = 0; i < listMentees.size(); i++)
     System.out.println(listMentees.get(i));
   }
   public ArrayList getMenteeList(){
     return listMentees;
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

     // settre methods
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


}

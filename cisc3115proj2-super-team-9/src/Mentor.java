//Very basic idea of Mentor interface
import java.io.*;
public interface Mentor{
  public String type = null;
  public String firstName = null;
  public String lastName = null;
  public String address = null;
  public String phoneNumber = null;
  public String mentee = null;

  String getFirstName();
  String getLastName();
  String getAddress();
  String getPhoneNumber();

}

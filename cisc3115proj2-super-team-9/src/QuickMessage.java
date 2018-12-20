import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class QuickMessage {

  private String from;
  private String to;
  private String txt;

  public QuickMessage(){
  }

  public QuickMessage(String from, String to, String txt){
    this.from = from;
    this.to = to;
    this.txt = txt;
  }
  static ArrayList<QuickMessage> msgList = new ArrayList<QuickMessage>();

  public void getMessage(){
      Scanner input =new Scanner(System.in);
      System.out.println("Please enter your name: ");
      String from = input.nextLine();
      System.out.println("Enter recipient name ");
      String to = input.nextLine();
      System.out.println("Please enter your message");
      String txt = input.nextLine();
      System.out.println("Message sent!");
      makeMsgObject(from, to, txt);
  }

  public void makeMsgObject(String from, String to, String txt){
    QuickMessage qMsg = new QuickMessage(from, to, txt);
      msgList.add(qMsg);
  }

  public void printMessages(){
    for (int i = 0; i < msgList.size(); i++){
      System.out.println(msgList.get(i).toString());
      System.out.println("-----------------");
    }
  }
  public String toString(){
    return "FROM: " + from + " \n  TO: " + to + " \nTEXT: " + txt;
  }

}

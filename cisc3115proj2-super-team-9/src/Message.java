import java.util.ArrayList;
public class Message {
  ArrayList<Message> msgList = new ArrayList<Message>();
  private String from;
  private String to;
  private String txt;

  public Message(){
    
  }

  public Message(String from, String to, String txt){
    this.from = from;
    this.to = to;
    this.txt = txt;
  }

}

import java.util.*;
public class Mentor {

  private String name;
  private ArrayList<String> list = new ArrayList<>();

  public Mentor(){

  }
  public Mentor(String name){

    this.name = name;
    list.add(name);
  }

  public String getName(){
    return name;
  }

  public void printMentorList(){
    for (String m : list){
      System.out.println(m);
    }
  }

  public static void main(String[]args){
    Mentor m1 = new Mentor("tom");
    Mentor m2 = new Mentor("jerry");
    Mentor m3 = new Mentor("apple");
    Mentor m4 = new Mentor("king");

    // System.out.println(m1.getName());
    // System.out.println(m2.getName());
    // System.out.println(m3.getName());
    // System.out.println(m4.getName());

    m1.printMentorList();
  }


}

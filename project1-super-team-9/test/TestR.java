public class TestR{
  public static void main(String []args){
    // Faculty m = new Faculty("TOM");
    // GraduateStudent student = new GraduateStudent("Faisal","ibrahim","ocean","917",m);
    // System.out.println(student);
  Mentor m1 = new Mentor("tom");
  Mentor m2 = new Mentor("jerry");
  Mentor m3 = new Mentor("apple");
  Mentor m4 = new Mentor("king");

  System.out.println(m1.getName());
  System.out.println(m2.getName());
  System.out.println(m3.getName());
  System.out.println(m4.getName());

  m1.printMentorList();



  }

}

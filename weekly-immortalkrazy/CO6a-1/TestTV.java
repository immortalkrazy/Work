
public class TestTV {
  public static void main (String[] args){

    TV tv1 = new TV();
    tv1.turnOn();
    tv1.setChannel(30);
    tv1.setVolume(3);

    TV tv2 = new TV();
    tv2.turnOn();
    tv2.channelUp();
    tv2.channelUp();
    tv2.volumeUp();

    System.out.println("Number of TVs Created is :  "
      + TV.getNumberOfObjects());
    System.out.println("tv1's Channel is " + tv1.getChannel()
     + " and Volume level is "+ tv1.getVolume());
    System.out.println("Manufacturing Date and Time of tv1 is: "
     + tv1.getDate());
    System.out.println("tv2's Channel is " + tv2.getChannel()
     + " and Volume level is "+ tv2.getVolume());
    System.out.println("Manufacturing Date and Time of tv2 is: "
     + tv2.getDate());
  }
}

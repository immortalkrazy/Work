public class Passenger {

  private int id;
  private String name;
  private int seatClass;
	private int seatNumber;

	public Passenger(int id, String name, int seatClass){
  	this.id = id;
  	this.name = name;
    this.seatClass = seatClass;
  }

  public String toString()	{
  	return "Passenger[id=" + id + ",name=" + name + ",seatClass=" + seatClass + ",seatNumber=" + seatNumber + "]";
  }

  public int getSeatClass(){
  	return seatClass;
  }

	public void setSeatNumber(int seatNumber)	{
		this.seatNumber = seatNumber;
	}

	public int getSeatNumber(){
		return seatNumber;
	}
}

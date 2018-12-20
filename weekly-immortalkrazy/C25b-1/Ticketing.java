import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Ticketing {

  private static Random rng = new Random();
  private static int id = 0;

  public static void main(String[] args)	{
  	PriorityQueue<Passenger> queue = new PriorityQueue<Passenger>(new PassengerComparator());
  	enqueue(queue, 15);
		System.out.println();
  	//dequeue(queue);
		assignSeat(queue);
  	}

  private static void enqueue(Queue<Passenger> queue, int maxPassengers)	{
    System.out.println("\nREGISTERING PASSENGERS\n----------------------------");
    for (int i = 0; i < maxPassengers; i++) {
      Passenger p = makeRandomPassenger();
			System.out.println(p.toString());
      queue.add(p);
    }
  }

  private static void dequeue(Queue<Passenger> queue)	{
    while (!queue.isEmpty()){
      System.out.println("----------------");
      System.out.println("Peek at the queue of size " + queue.size());
      Passenger p = queue.peek();
      System.out.println("On the head of the queue is " + p.toString());
      System.out.println("Peeked at the queue of size " + queue.size());
      System.out.println("Poll at the queue of size " + queue.size());
      p = queue.poll();
      System.out.println("On the head of the queue is " + p.toString());
      System.out.println("Polled at the queue of size " + queue.size());
    }
  }

	private static void assignSeat(Queue<Passenger> queue){
    System.out.println("ASSIGNING SEATS\n----------------------------");
		int i = 1;

		while(!queue.isEmpty()){
      Passenger p = queue.peek();

			if(p.getSeatClass() == 1){
        p.setSeatNumber(i);
      }
			else{
				p.setSeatNumber(i);
			}
      System.out.println(p.toString());
			i++;
			p = queue.poll();
		}
	}

  private static Passenger makeRandomPassenger(){
    String[] names = {"John", "Tom", "Ben", "Arthur",
    	"Emma", "Erica", "Sally", "Rose", "Uma", "Anthony", "Jerry", "Sasha", "Wendy"};
    int[] Classes = {1, 2};

    String name = names[rng.nextInt(names.length)];
    int Class = Classes[rng.nextInt(Classes.length)];
    id++;
    return new Passenger(id, name, Class);
  }

}

public class ComparableCircle extends Circle implements Comparable<ComparableCircle>
{
  	public ComparableCircle(double radius)
	{
    	super(radius);
  	}

  	public int compareTo(ComparableCircle c)
	{
    	if (getArea() > c.getArea()) return 1;
    	else if (getArea() < c.getArea()) return -1;
    	else return 0;
  	}

  	public String toString()
  	{
    	return "Radius: " + getRadius() + " Area: " + getArea();
  	}
}

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortShapes
{
	public static void main(String[] args)
  	{
		ArrayList<Shape> shapes =
    		new ArrayList<Shape>(Arrays.asList(
    		new ComparableRectangle(12.4, 17.4),
    		new ComparableRectangle(21.14, 25.4),
        new ComparableRectangle(10.14, 45.4),
        new ComparableRectangle(21.4, 25.4),
    		new ComparableCircle(33.4),
        new ComparableCircle(23.34),
        new ComparableCircle(7.4),
        new ComparableCircle(12.14)));

		Collections.sort(shapes, new Comparator<Shape>()
		{
			@Override
			public int compare(Shape s1, Shape s2)
			{
				return Double.compare(s1.getArea(), s2.getArea());
			}
		});

		for(Shape shape : shapes)
		{
			System.out.print(shape + " ");
			System.out.println();
		}
  	}
}

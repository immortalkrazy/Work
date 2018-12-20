import java.util.Comparator;
public class SortByFirstName implements Comparator<Person>{

  public int compare(Person lhs, Person rhs){
    String s1 = lhs.getFirstName();
    String s2 = rhs.getFirstName();
    if (s1.compareTo(s2) > 0)
      return 1;
    else if(s1.compareTo(s2) < 0)
      return -1;
    else
      return 0;
  }
}

import java.util.Comparator;
public class SortByLastName implements Comparator<Person>{

  public int compare(Person lhs, Person rhs){
    String s1 = lhs.getLastName();
    String s2 = rhs.getLastName();
    if (s1.compareTo(s2) > 0)
      return 1;
    else if(s1.compareTo(s2) < 0)
      return -1;
    else
      return 0;
  }
}

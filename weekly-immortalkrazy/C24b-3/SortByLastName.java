import java.util.Comparator;
public class SortByLastName implements Comparator<Student>{
  public int compare(Student lhs, Student rhs){
    return lhs.getLastName().compareTo(rhs.getLastName());
  }
}

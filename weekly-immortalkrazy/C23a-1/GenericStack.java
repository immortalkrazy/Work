import java.util.ArrayList;
//import java.util.Stack;

public class GenericStack<E>{

  private ArrayList<E> list = new ArrayList<>();

  public int getSize(){
    return list.size();
  }

  public E peek(){
    return list.get(getSize() - 1);
  }

  public void push(E o){
    list.add(o);
  }

  public E pop(){
    E o = list.get(list.size() - 1);
    list.remove(list.size() - 1);
    return o;
  }

  public boolean isEmpty(){
    return list.isEmpty();
  }

  @Override
  public String toString(){
    return "Strack: " + list.toString();
  }

}

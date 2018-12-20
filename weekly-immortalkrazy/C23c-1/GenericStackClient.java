public class GenericStackClient{

  public static void main(String []args){

    GenericStack<Integer> stack1 = new GenericStack<>();

    stack1.push(1);
    stack1.push(5);
    stack1.push(7);
    System.out.println(stack1);
    stack1.pop();
    stack1.pop();
    stack1.pop();
    System.out.println(stack1);

    GenericStack<Double> stack2 = new GenericStack<>();

    stack2.push(2.0);
    stack2.push(4.0);
    stack2.push(6.0);
    System.out.println(stack2);
    stack2.pop();
    stack2.pop();
    stack2.pop();
    System.out.println(stack2);
  }// end of main
}

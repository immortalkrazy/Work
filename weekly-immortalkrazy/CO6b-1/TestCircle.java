public class TestCircle {
  public static void main(String[] args) {
    Circle myCircle = new Circle (1.0);
    int n = 5;
    CircleUtils cUtils = new CircleUtils();

    System.out.println("----------printCircle(myCircle, n)-------------");
    cUtils.printCircle(myCircle, n);
    System.out.println("----------printCircle(myCircle)-------------");
    cUtils.printCircle(myCircle);
    System.out.println("----------doubleRadius(Circle c)-------------");
    cUtils.doubleRadius(myCircle);
    cUtils.printCircle(myCircle);
    System.out.println("----------doubleArea(Circle c)-------------");
    cUtils.doubleArea(myCircle);
    cUtils.printCircle(myCircle);
    System.out.println("----------getNewCircleDoubleRadius-------------");
    cUtils.printCircle(cUtils.getNewCircleDoubleRadius(myCircle));
    System.out.println("----------getNewCircleDoubleArea-------------");
    cUtils.printCircle(cUtils.getNewCircleDoubleArea(myCircle));
    System.out.println("---------------------------------------------");
    cUtils.printCircle(myCircle);
  }
}

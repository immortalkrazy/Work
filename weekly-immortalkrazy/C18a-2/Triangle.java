public abstract class Triangle extends Shape{

  private double side1;
  private double side2;
  private double side3;
  private String name;

  public Triangle(String name){
    super(name);
  }

	public Triangle(String name, double side1, double side2, double side3) {
		super(name);
		this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
	}
//  public Triangle(String name, double side){
//    super(name);
//    this.side1 = side;
//  }
  // abstract getArea method

  public abstract boolean isEquilateral();

}// end of class

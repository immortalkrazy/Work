public class GeometricObjects{
  private String color = "white";
  private boolean filled;
  private java.util.Date dateCreated;

  /** Construct a default geometric object */
  public GeometricObjects(){
    dateCreated = new java.util.Date();
  }

  /** Construct an obeject with specified*/
  public GeometricObjects(String color, boolean filled){
    dateCreated = new java.util.Date();
    this.color = color;
    this.filled = filled;
  }
  /** Set new color*/
  public void setColor(String color){
    this.color = color;
    this.filled = true;
  }
  /** return color*/
  public String getColor(){
    return color;
  }
  /**set a new filled*/
  public void setFilled(boolean filled){
    this.filled = filled;
  }
  /** Return filled. since filled is boolean*/
  public boolean isFilled(){
    return filled;
  }
  /*get date created*/
  public java.util.Date getDateCreated(){
    return dateCreated;
  }
  /*Return a string representation of object*/
  public String toString(){
    return "Created on: " + dateCreated + "\ncolor: " + color +
    " and filled: " + filled;
  }
}

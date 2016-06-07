package instructor.lectures;

public class Circle {
  // attributes
  private float x;
  private float y;
  private float radius;

  // methods
  public float getArea() {
    return 3.14f * radius * radius;
  }

  public float getCircumference() {
    return 2f * 3.14f * radius;
  }

  // constructors

  // default
  public Circle() {
    this.x = 0f;
    this.y = 0f;
    this.radius = 2f;
  }

  // custom 1
  public Circle(float x, float y) {
    this.x = x;
    this.y = y;
    this.radius = 1f;
  }

  // custom 2
  public Circle(float x, float y, float radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  // Setters and Getters
  public float getX() {
    return x;
  }

  public void setX(float x) {
    this.x = x;
  }

  public float getY() {
    return y;
  }

  public void setY(float y) {
    this.y = y;
  }

  public float getRadius() {
    return radius;
  }

  public void setRadius(float radius) {
    this.radius = radius;
  }

}



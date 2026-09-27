/**
 * Represents a rectangle defined by its width and height.
 * Provides operations for computing area, scaling the rectangle,
 * and comparing its size to another rectangle.
 */

public class Rectangle {
  private double width;
  private double height;

  /**
   * Constructs a rectangle with the given width and height.
   *
   * @param w the width of the rectangle
   * @param h the height of the rectangle
   */
  public Rectangle(double w, double h) {
    this.width = w;
    this.height = h;
  }

  /**
   * Returns the area of this rectangle.
   *
   * @return the product of width and height
   */
  public double area() {
    return width * height;
  }

  /**
   * Scales the rectangle by multiplying both dimensions by the given factor.
   *
   * @param factor the amount to scale the rectangle by
   */
  public void scale(double factor) {
    width = width * factor;
    height = height * factor;
  }

  /**
   * Returns whether this rectangle has a larger area than another rectangle.
   *
   * @param other the rectangle to compare against
   * @return {@code true} if this rectangle's area is greater than the other's,
   *         {@code false} otherwise
   */
  public boolean isLargerThan(Rectangle other) {
    return area() > other.area();
  }
}

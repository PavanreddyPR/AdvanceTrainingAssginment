package FirstPack;

public class Rectangle1 {

   private double length;
   private double width;

   /**
    * Constructor
    */
   public Rectangle1()
   {
      length = 0;
      width  = 0;
   }

   /**
    * Overloaded constructor
    */
   public Rectangle1(double l, double w)
   {
      length = l;
      width  = w;
   }

   /**
    * The set method accepts two arguments
    * which are stored in the length and width fields
    */
   public void set(double l, double w)
   {
      length = l;
      width  = w;
   }

   /**
    * The getArea method computes and returns the area
    */
   public double getArea()
   {
      return length * width;
   }

   /**
    * The getPerimeter method computes and returns the perimeter
    */
   public double getPerimeter()
   {
      return 2 * (length + width);
   }
}
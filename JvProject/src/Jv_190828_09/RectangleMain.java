package Jv_190828_09;

/**
 * RectangleMain
 */
public class RectangleMain {

   public static void main(String[] args) {
       Rectangle rect1 = new Rectangle(15, 15);
       Rectangle rect2 = new Rectangle(20, 20);
       
       System.out.println("rect1 a : " + rect1.getArea());
       System.out.println("rect1 p : " + rect1.getPeri());
       System.out.println("rect1 r : " + rect1.result());
       System.out.println("rect2 a : " + rect2.getArea());
       System.out.println("rect2 p : " + rect2.getPeri());
       System.out.println("rect2 r : " + rect2.result());
   } 
}
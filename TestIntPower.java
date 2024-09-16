/**
 * Test the IntPower class.
 */
public class TestIntPower{
  public static void main(String[] args){
    System.out.println(IntPower.raise(2, 5) + " " +
       Math.pow(2, 5));
    System.out.println(IntPower.raise(2, -5) + " " +
       Math.pow(2, -5));
    System.out.println(IntPower.raise(2, 0) + " " +
       Math.pow(2, 0));
    System.out.println(IntPower.raise(2.5, 5) + " " +
       Math.pow(2.5, 5));
    System.out.println();

    System.out.println(IntPower.raise(-2, 5) + " " +
       Math.pow(-2, 5));
    System.out.println(IntPower.raise(-2, -5) + " " +
       Math.pow(-2, -5));
    System.out.println(IntPower.raise(-2, 0) + " " +
       Math.pow(-2, 0));
    System.out.println(IntPower.raise(-2.5, 5) + " " +
       Math.pow(-2.5, 5));
  }
}
/**
 * PROGRAM 3-2: Float Remainder
 *
 * Demonstrate the float remainder operation.
 */
public class FloatRemainder {
  public static void main(String args[]) {
    float values[] = {
       5f,   3f,
       5.5f, 1.1f,
      -5.5f, 2.1f,
       5.5f, -3.1f,
      -5.5f, -4.1f,
    };
    for (int i = 0; i < values.length/2; ++i) {
      float x = values[2*i];
      float y = values[2*i+1];
      System.out.println(x + " % " + y + " = " + x%y);
    }
  }
}
/**
 * PROGRAM 3-3: Zero, Infinity, and Not-a-Number
 *
 * Investigate the results of floating-point arithmetic
 * involving zero, infinity, and NaN.
 */
public class ZeroInfinityNaN {
  public static void main(String args[]) {
    AlignRight ar = new AlignRight();
    float operands[] = {
      -0f, +0f, -1f, 1f,
      Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NaN,
    };

    ar.print("x", 10); ar.print("y", 10); ar.print("", 2);
    ar.print("x+y", 10); ar.print("x-y", 10);
    ar.print("x*y", 10); ar.print("x/y", 10); ar.print("x%y", 10);
    ar.underline();

    for (int i = 0; i < operands.length; ++i) {
      for (int j = 0; j < operands.length; ++j) {
        float x = operands[i];
        float y = operands[j];
        ar.print(x, 10); ar.print(y, 10); ar.print("", 2);
        ar.print(x+y, 10); ar.print(x-y, 10);
        ar.print(x*y, 10); ar.print(x/y, 10); ar.print(x%y, 11);
        ar.println();
      }
    }
  }
}
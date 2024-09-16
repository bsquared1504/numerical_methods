/**
 * PROGRAM 3-1: IEEE 754 Standard Floating-Point Formats
 *
 * Demonstrate the IEEE 754 standard floating-point formats
 * with various float and double values.
 */
public class FPFormats implements IEEE754Constants {
  private void display() throws IEEE754.Exception {
    // Floats
    float floats[] = {-0.0f, 0.0f, -1.0f, 1.0f, 0.75f, -0.375f,
                      Float.MIN_VALUE, Float.MAX_VALUE,
                      Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY,
                      Float.NaN,
                     };
    for (int i = 0; i < floats.length; ++i) {
      new IEEE754(floats[i]).print();
    }

    // Doubles
    double doubles[] = {
      -0.375,
      Double.MIN_VALUE, Double.MAX_VALUE,
      Double.POSITIVE_INFINITY,
      Double.NaN,
    };
    for (int i = 0; i < doubles.length; ++i) {
      new IEEE754(doubles[i]).print();
    }
    System.out.println("-----------------------------");

    IEEE754 numbers[] = {
      // Floats
      new IEEE754(
        0,
        IEEE754.toFloatBiasedExponent(-FLOAT_EXPONENT_BIAS),
        new IEEE754.FloatFraction("00101")),
      new IEEE754(
        0,
        IEEE754.toFloatBiasedExponent(-126),
        new IEEE754.FloatFraction("0")),
      new IEEE754(
        0,
        IEEE754.toFloatBiasedExponent(-FLOAT_EXPONENT_BIAS),
        new IEEE754.FloatFraction("11111111111111111111111")),
      // Doubles
      new IEEE754(
        0,
        IEEE754.toDoubleBiasedExponent(-DOUBLE_EXPONENT_BIAS),
        new IEEE754.DoubleFraction("00101")),
      new IEEE754(
        0,
        IEEE754.toDoubleBiasedExponent(-1022),
        new IEEE754.DoubleFraction("0")),
      new IEEE754(
        0,
        IEEE754.toDoubleBiasedExponent(-DOUBLE_EXPONENT_BIAS),
        new IEEE754.DoubleFraction("11111111111111111111111111" +                                            "11111111111111111111111111")),
    };
    for (int i = 0; i < numbers.length; ++i) {
      numbers[i].print();
    }
  }

  /**
   * Main.
   * @param args the string array of program arguments
   */
  public static void main(String args[]) {
    FPFormats formats = new FPFormats();
    try {
      formats.display();
    }catch(IEEE754.Exception ex) {
      System.out.println("***** Error: " + ex.getMessage());
    }
  }
}

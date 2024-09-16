/**
 * PROGRAM 3-4: One Third
 *
 * Investigate the floating-point representation of 1/3.
 */
public class OneThird {
  public static void main (String args[]) {
    float  fThird     = 1/3f;
    double dConverted = fThird;
    double dThird     = 1/3d;

    System.out.println("          Float 1/3 = " + fThird);
    System.out.println("Converted to double = " + dConverted);
    System.out.println("         Double 1/3 = " + dThird);

    IEEE754 ieeeFThird     = new IEEE754(fThird);
    IEEE754 ieeeDConverted = new IEEE754(dConverted);
    IEEE754 ieeeDThird     = new IEEE754(dThird);

    ieeeFThird.print();
    ieeeDConverted.print();
    ieeeDThird.print();

    // Prepend the leading 0 bits of the converted 1/3.
    int    unbiased = ieeeDConverted.unbiasedExponent();
    String bits     = "1" + ieeeDConverted.fractionBits();
    while (++unbiased < 0) bits = "0" + bits;
    // Sum the indicated negative powers of 2.
    double sum   = 0;
    double power = 0.5;
    for (int i = 0; i < bits.length(); ++i) {
      if (bits.charAt(i) == '1') sum += power;
      power /= 2;
    }

    System.out.println();
    System.out.println("Converted 1/3 by summation = " + sum);
  }
}
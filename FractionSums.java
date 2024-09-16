/**
 * PROGRAM 4-1: Fraction Sums
 *
 * For each n, compute the sum 1/d + 2/d + 3/d + ... + n/d = d/d
 * where:
 *     n = 10, 100, 1000, ..., 100,000,000
 *     d = 1 + 2 + 3 + ... + n = (n/2)(n + 1)
 *
 * See how close each sum is to 1.
 */
public class FractionSums {
  public static void main(String args[]) {
    AlignRight ar = new AlignRight();
    ar.print("n", 9); ar.print("Denom", 14);
    ar.print("1/Denom", 14); ar.print("n/Denom", 13);
    ar.print("Sum", 11); ar.print("% Error", 13);
    ar.underline();
    for (int n = 10; n <= 100000000; n *= 10) {
      float sum   = 0;
      float denom = (0.5f*n)*(n + 1);
      // Sum fractions.
      for (int i = 1; i <= n; ++i) sum += i/denom;
      ar.print(n, 9); ar.print(denom, 14); ar.print(1/denom, 14);
      ar.print(n/denom, 13); ar.print(sum, 11);
      ar.print(100*Math.abs(sum - 1), 13);
      ar.println();
    }
  }
}
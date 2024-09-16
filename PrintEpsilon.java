/**
 * PROGRAM 3-5: Print Machine Epsilon
 *
 * Decompose and print the machine epsilon
 * for the float and double types.
 */
public class PrintEpsilon {
  public static void main(String args[]) {
    (new IEEE754(Epsilon.floatValue())).print();
    (new IEEE754(Epsilon.doubleValue())).print();
  }
}

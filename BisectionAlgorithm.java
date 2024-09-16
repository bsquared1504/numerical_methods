/**
 * PROGRAM 5C1: Bisection Algorithm
 *
 * Demonstrate the Bisection Algorithm on a function.
 */
public class BisectionAlgorithm {
  /**
   * Main program.
   * @param args the array of runtime arguments
   */
  public static void main(String args[]) {
    try {
      BisectionRootFinder finder =
        new BisectionRootFinder(RootFunctions.function("x^2 - 4"),
                                -0.25f, 3.25f);
      AlignRight ar = new AlignRight();
      ar.print("n", 2);
      ar.print("xNeg", 10); ar.print("f(xNeg)", 14);
      ar.print("xMid", 10); ar.print("f(xMid)", 14);
      ar.print("xPos", 10); ar.print("f(xPos)", 13);
      ar.underline();

      // Loop until convergence or failure.
      boolean converged;
      do {
        converged = finder.step();
        ar.print(finder.getIterationCount(), 2);
        ar.print(finder.getXNeg(), 10);
        ar.print(finder.getFNeg(), 14);
        ar.print(finder.getXMid(), 10);
        ar.print(finder.getFMid(), 14);
        ar.print(finder.getXPos(), 10);
        ar.print(finder.getFPos(), 13);
        ar.println();
      } while (!converged);
      System.out.println("\nSuccess! Root = " +
                         finder.getXMid());
    } catch(Exception ex) {
      System.out.println("***** Error: " + ex);
    }
  }
}
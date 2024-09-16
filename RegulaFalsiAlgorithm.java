/**
 * PROGRAM 5C2: Regula Falsi Algorithm
 * Demonstrate the Regula Falsi Algorithm on a function.
 */ public class RegulaFalsiAlgorithm {
  /**
   * Main program.
   * @param args the array of runtime arguments
   */
  public static void main(String args[]){
    try {
      RegulaFalsiRootFinder finder =
      new RegulaFalsiRootFinder(RootFunctions.function("x^2 - 4"),
                                                      -0.25f, 3.25f);
      AlignRight ar = new AlignRight();
      ar.print("n", 2);
      ar.print("xNeg", 11); ar.print("f(xNeg)", 15);
      ar.print("xFalse", 11); ar.print("f(xFalse)", 15);
      ar.print("xPos", 6); ar.print("f(xPos)", 9);
      ar.underline();
      // Loop until convergence or failure.
      boolean converged;
      do {
        converged = finder.step();
        ar.print(finder.getIterationCount(), 2);
        ar.print(finder.getXNeg(), 11);
        ar.print(finder.getFNeg(), 15);
        ar.print(finder.getXFalse(), 11);
        ar.print(finder.getFFalse(), 15);
        ar.print(finder.getXPos(), 6);
        ar.print(finder.getFPos(), 9);
        ar.println();
      } while (!converged);
      System.out.println("\nSuccess! Root = " + finder.getXFalse());
    } catch(Exception ex) {
      System.out.println("***** Error: " + ex);
    }
  }
}
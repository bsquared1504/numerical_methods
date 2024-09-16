/**
 * PROGRAM 5C4: Secant Algorithm
 *
 * Demonstrate the Secant Algorithm on a function.
 */
public class SecantAlgorithm {
  /**
   * Main program.
   * @param args the array of runtime arguments
   */
  public static void main(String args[]){
    try {
      SecantRootFinder finder =
        new SecantRootFinder(RootFunctions.function("x^2 - 4"),
                                                    0.3625f, 1.3625001f);
      AlignRight ar = new AlignRight();
      ar.print("n", 2);
      ar.print("x[n-1]", 10); ar.print("f(x[n-1])", 12);
      ar.print("x[n]", 10); ar.print("f(x[n])", 13);
      ar.print("x[n+1]", 10); ar.print("f(x[n+1])", 14);
      ar.underline();
      // Loop until convergence or failure.
      boolean converged;
      do {
        converged = finder.step();
        ar.print(finder.getIterationCount(), 2);
        ar.print(finder.getXnm1(), 10);
        ar.print(finder.getFnm1(), 12);
        ar.print(finder.getXn(), 10);
        ar.print(finder.getFn(), 13);
        ar.print(finder.getXnp1(), 10);
        ar.print(finder.getFnp1(), 14);
        ar.println();
      } while (!converged);
      System.out.println("\nSuccess! Root = " + finder.getXnp1());
    }catch(Exception ex) {
      System.out.println("***** Error: " + ex);
    }
  }
}
/**
 * PROGRAM 1-2: RoundofErors
 * Demonstrate how a tiny roundoff error
 * can explod into a much lager one.
 */
public class RoundoffErrors{
  public static void main(String args[]){
    float denominator = 20000000;
    float a           = 10000001/denominator;
    float b           = 1/2f;
    float diff1       = Math.abs(a - b);
    float pctError1   = 100*diff1/b;

    float inverse     = 1/diff1;
    float diff2       = Math.abs(inverse - denominator);
    float pctError2   = 100*diff2/denominator;
    System.out.println("        a = " + a);
    System.out.println("        b = " + b);
    System.out.println("    diff1 = " + diff1);
    System.out.println("pctError1 = " + pctError1 + "%");

    System.out.println();
    System.out.println("  inverse = " + inverse);
    System.out.println("    diff2 = " + diff2);
    System.out.println("pctError2 = " + pctError2 + "%");
    System.out.println();
    System.out.println("   factor = " + pctError2/pctError1);
  }
}
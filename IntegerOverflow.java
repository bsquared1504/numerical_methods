/**
 * PROGRAM 2-1: Integer Overflow
 * Show the effects of integer overflow and of division by zero.
 */
public class IntegerOverflow{
  public static void main(String[] args){
    int big = 2147483645;
    for (int i=0; i<=4; ++i){
      System.out.println(big + " + " + i + " = " + (big+i));
    }
    System.out.println();

    for (int i=0; i<=4; ++i){
      System.out.println(big + " * " + i + " = " + (big*i));
    }
    System.out.println();

    int dze = big/0;
  }
}
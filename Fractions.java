public class Fractions{
  private static final float HALF = 1/2f;
  private static final float THIRD = 1/3f;
  private static final float QUARTER = 1/4f;
  private static final float FIFTH = 1/5f;
  private static final float SIXTH = 1/6f;
  private static final float SEVENTH = 1/7f;

  private static final int FACTOR = 840;

  public static void main(String[] args){
    System.out.println("1/2 = " + HALF);
    System.out.println("1/3 = " + THIRD);
    System.out.println("1/4 = " + QUARTER);
    System.out.println("1/5 = " + FIFTH);
    System.out.println("1/6 =" + SIXTH);
    System.out.println("1/7 =" + SEVENTH);

    float sum = 0;
    System.out.println();
    for(int i = 0; i < FACTOR; ++i) sum += HALF;
    System.out.println("1/2 summed " + FACTOR +" times = " + sum +
                       " (should be " + FACTOR/2 + ")");

    sum = 0;
    for(int i = 0; i < FACTOR; ++i) sum += THIRD;
    System.out.println("1/3 summed "+ FACTOR + " times = " + sum +
                       " (should be " + FACTOR/3 + ")");

    sum = 0;
    for (int i = 0; i < FACTOR; ++i) sum += QUARTER;
    System.out.println("1/4 summed " + FACTOR + " times = " + sum +
                       " (should be " + FACTOR/4 + ") ");

    sum = 0;
    for (int i = 0; i < FACTOR; ++i) sum += FIFTH;
    System.out.println("1/5 summed " + FACTOR +" times = " + sum +
                      " (should be " + FACTOR/5 + ") ");

    sum = 0;
    for (int i = 0; i < FACTOR; ++i) sum += SIXTH;
    System.out.println("1/6 summed "+ FACTOR + " times= " + sum +
                       " (should be " + FACTOR/6 + ") ") ;

    sum = 0;
    for (int i = 0; i <FACTOR; ++i) sum += SEVENTH;
    System.out.println("1/7 summed " + FACTOR + " times = " + sum +
                       " (should be " + FACTOR/7 + ") ") ;
  }
}
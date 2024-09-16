/**
 * PROGRAM 2-2: Integer Wraper Clases
 * Print the values of some of the constants
 * defined in the integer wrapper classes.
 */
public class IntegerWrapperClasses{
  public static void main(String[] args){
    // Byte
    System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
    System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);

    // Short
    System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
    System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
    System.out.println();

    // Character
    System.out.println("Character.MIN_VALUE = " + (int) Character.MIN_VALUE);
    System.out.println("Character.MAX_VALUE = " + (int) Character.MAX_VALUE);
    System.out.println();

    // Integer
    System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
    System.out.println("Binary: " +
                       Integer.toBinaryString(Integer.MIN_VALUE));
    System.out.println("   Hex: " +
                       Integer.toBinaryString(Integer.MIN_VALUE));
    System.out.println();

    System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
    System.out.println("Binary: " +
                       Integer.toBinaryString(Integer.MAX_VALUE));
    System.out.println("   Hex: " +
                       Integer.toBinaryString(Integer.MAX_VALUE));
    System.out.println();

    // Long
    System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
    System.out.println("Binary: " +
                       Long.toBinaryString(Long.MIN_VALUE));
    System.out.println("   Hex: " +
                       Long.toBinaryString(Long.MIN_VALUE));
    System.out.println();

    System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
    System.out.println("Binary: " +
                       Long.toBinaryString(Long.MAX_VALUE));
    System.out.println("   Hex: " +
                       Long.toBinaryString(Long.MAX_VALUE));
    System.out.println();

    System.out.println(5/2);
  }
}
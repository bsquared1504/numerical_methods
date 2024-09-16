// source:
// https://stackoverflow.com/questions/10643754/convert-float-and-double-to-bit-and-hexadecimal-representation-in-java
// https://www.geeksforgeeks.org/float-floattointbits-method-in-java-with-examples/#

public class FloatingPoint {
  public static void main(String[] args) {
    // print the bit pattern for 1/2
    float a = 0.5f;
    int bits = Float.floatToIntBits(a);
    String output =
      String.format("%32s",
        Integer.toBinaryString(bits)).replace(" ", "0");
    System.out.println("bit pattern for 1/2 in binary:\n"+output);
    output = String.format("%8s",
      Integer.toHexString(bits)).replace(" ", "0");
    System.out.println("bit pattern for 1/2 in hexdecimal:\n"+output);
  }
}
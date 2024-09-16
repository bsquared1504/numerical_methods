class SqrtFloat {
  public static void main(String[] args) {
    double n = 2;
    double tolerance = 100*Math.pow(2, -24);
    double left = 0;
    double right = n;
    double guess = right;
    System.out.println(tolerance);

    while(true){
      System.out.println(guess);
      if(Math.abs(guess*guess - n) < tolerance){
        break; // found answer
      }else if(guess*guess < n){
        left = guess;
      }else{
        right = guess;
      }
      guess = (left+right)/2;
    }
    System.out.println("the sqrt of "+n+" is "+guess);
  }
}

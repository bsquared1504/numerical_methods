class SqrtInt {
  public static void main(String[] args) {
    long n = 2;
    System.out.println(n);
    for(int i=0; i<=n; i++){
      if(i*i == n){
        System.out.println("the sqrt of "+n+" is "+i);
        return;
      }
    }
    System.out.println("no sqrt");
  }
}

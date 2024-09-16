import java.util.Hashtable;

/**  
 * Load into a global table the functions whose roots we want to find.  
 */ 
public class RootFunctions {     
  /** global function table */     
  private static Hashtable TABLE = new Hashtable(32); 
  
  // Enter the functions into the global function table.     
  static {        
    enterFunctions();     
  }     
  
  /**      
   * Return the function with the given hash key      
   * @param key the hash key      
   * @return the function      
   */     
  public static Function function(String key) {
    return (Function) TABLE.get(key);     
  }     
  
  /**      
   * Enter all the functions into the global function table.      
   */     
  private static void enterFunctions() {         
    // Function f(x)  = x^2 - 4         
    //          f'(x) = 2x         
    TABLE.put(             
      "x^2 - 4",             
      new Function() {                 
        public float at(float x) {                     
          return x*x - 4;                 
        }                 
        
        public float derivativeAt(float x) {
          return 2*x;                 
        }             
      }
    ); 
    
    // Function g(x) = (x + 4/x)/2         
    TABLE.put(             
      "(x + 4/x)/2",             
      new Function() {                 
        public float at(float x) {                     
          return (x + 4/x)/2;                 }             
      }
    );
  } 
}
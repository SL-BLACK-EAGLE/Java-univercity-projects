
package source;

import model.A;


public class C {
    public static void main(String[] args) {
        A.hello();   //with import 
        
        model.A.hello();  //without import we need to tell where this come from. this is the best method
    }
}

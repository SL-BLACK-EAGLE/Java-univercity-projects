package model;

public class A {
    public static void main(String[] args) {
        System.out.println(A.x1);
        A.x1 = 20;
        System.out.println(A.x1);
        
//        System.out.println(new A().x2);
       
        A a1 = new A();
        System.out.println(a1.x2);
        a1.x2 = 50;
        System.out.println(a1.x2);
        
        A a2 = new A();
        System.out.println(a2.x2);
        
    }
    
    static int x1 = 10;
    
    int x2 = 10;
}

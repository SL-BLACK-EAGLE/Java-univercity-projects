package model;

public class A {

    public static void main(String[] args) {
        System.out.println("Main");
        hello();
        A.hello();
    }
    public static void hello () {
        System.out.println("Hello");
    }
    
}


package pkgdefault.methods;


public class MyClass implements interface01, interface02 { 
    public int foo(int myInt){
        System.out.println("Inside MyClass - foo");
        return myInt * 2;
    }
    
    //next code is neccesary because we implimented two interfaces that do the same thing
    
    public int goo(String myString){
        System.out.println("Inside MyClass - goo");
        return interface02.super.goo(myString);
    }
}

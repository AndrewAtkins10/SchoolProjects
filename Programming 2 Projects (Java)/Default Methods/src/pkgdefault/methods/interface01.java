
package pkgdefault.methods;


public interface interface01 {
    
    int foo(int myInt);
    default int goo(String myString){
        System.out.println("Inside interface01 - goo");
        return myString.length();
        
    }
    
}

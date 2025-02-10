
package pkgdefault.methods;



public interface interface02 {
    default int goo(String myString){
        System.out.println("Inside Interface02 - goo");
        return myString.indexOf("o");
    }
    
}

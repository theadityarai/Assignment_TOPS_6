package assignmentt2;

abstract class Parent {
   
    abstract void message();
}


class FirstSubclass extends Parent {
    
    void message() {
        System.out.println("This is first subclass");
    }
}


class SecondSubclass extends Parent {
    
    void message() {
        System.out.println("This is second subclass");
    }
}


public class Abstract_Class {
    public static void main(String[] args) {
        
        FirstSubclass first = new FirstSubclass();
        SecondSubclass second = new SecondSubclass();
        
        first.message();
        second.message();
    }
}
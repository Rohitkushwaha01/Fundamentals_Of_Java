
//When there are multiple constructors in the parent class, the constructor without any parameters is called from the child class

// if we want to call the constructor with parameters from the parent class we can use super keyword
// syntax: super(a,b);
class Base{
    public int x;

    //Constructor
    Base(){
        System.out.println("I'm a constructor");
    }
    // overloaded constructor
    Base(int a){
        System.out.println("I'm a overloaded constructor with value a as " + a);
    }
}

class Derived extends Base{
    public int y;

    //Constructor
    Derived(){
         // used to call constructor of base which is been overloaded
        // if super keyword is not used then the normal constuctor (i.e default constructor) will invoked which have no parameters.
        System.out.println("I'm a derived class constructor");
    }

    // overloaded constructor
    Derived(int b){
        super(1);
        System.out.println("I'm a overloaded constructor of Derived class with value b as " + b);
    }
}

class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("I'm a child of Derived constructor");
    }
    
    ChildOfDerived(int c){
        super(2);
        System.out.println("I'm a child of Derived constructor with value as " + c);
    }
}

public class Main {
    public static void main(String[] args) {
        Base b1 = new Base();
        System.out.println("--------------------------------------------------------------------------");

        Derived d = new Derived();
        System.out.println("--------------------------------------------------------------------------");

        Derived d1 = new Derived(5); 
        System.out.println("--------------------------------------------------------------------------");

        ChildOfDerived c = new ChildOfDerived();
        System.out.println("--------------------------------------------------------------------------");

        ChildOfDerived c1 = new ChildOfDerived(3);
    }
}
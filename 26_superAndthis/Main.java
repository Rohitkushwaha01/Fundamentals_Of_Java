<<<<<<< HEAD
class MyBase{
    int a;

    MyBase(int a){
        this.a = a; // "this" keyword is used for reference. Refer to the current object of methods or constructor.
    }
    
    public int getElement(){
        return a;
    }
}


class MyDerived extends MyBase{
    MyDerived(int b){
        super(4); // The super keyword refers to superclass (parent) objects.
    }
}

public class Main {
    public static void main(String[] args) {
        MyDerived C = new MyDerived(6);
        System.out.println(C.getElement());
    }
}


// The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter).

=======
class MyBase{
    int a;

    MyBase(int a){
        this.a = a; // "this" keyword is used for reference. Refer to the current object of methods or constructor.
    }
    
    public int getElement(){
        return a;
    }
}


class MyDerived extends MyBase{
    MyDerived(int b){
        super(4); // The super keyword refers to superclass (parent) objects.
    }
}

public class Main {
    public static void main(String[] args) {
        MyDerived C = new MyDerived(6);
        System.out.println(C.getElement());
    }
}


// The most common use of the this keyword is to eliminate the confusion between class attributes and parameters with the same name (because a class attribute is shadowed by a method or constructor parameter).

>>>>>>> 26c03d1b1199838c2ed6953ba5776fb03accb5f9
// The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.
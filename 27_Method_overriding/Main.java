// method overriding : Declaring a method in the Derived class which already exists there in the Base class is known as method overriding.

// If a child class implements the same method present in the parent class again, it is known as method overriding.(Redefining method of super class)

// When an object of subclass is created and the override method is called the method which has been implemented in the subclass is called and its code is executed.

class A{
    public void method1(){
        System.out.println("I am method 1 of class A");
    }

    public void method2(){
        System.out.println("I am methods 2 of class A");
    }
}

class B extends A{
    @Override // Override Annotation
    public void method2(){
        System.out.println("I am methods 2 of class B");
    }
}

public class Main{
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.method1();
        obj1.method2();
    }
}
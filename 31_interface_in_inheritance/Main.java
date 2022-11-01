// We cannot extend a interface in a class, but we can extend an interface with another interface by using inheritance

// first interface
interface sampleInterface{
    void method1();
    void method2();
}

// Second interface
interface ChildsampleInterface extends sampleInterface{
    void method3();
    void method4();
}

// even though we have implemented ChildsampleInterface we need to define methods of both interfaces sampleInterface and ChildsampleInterface because method class implements ChildsampleInterface and  this ChildsampleInterface extends sampleInterface.
class Method implements ChildsampleInterface{
    public void method1(){
        System.out.println("meth1");
    };
    public void method2(){
        System.out.println("meth2");
    };
    public void method3(){
        System.out.println("meth3");
    };
    public void method4(){
        System.out.println("meth4");
    };
}

public class Main {
    public static void main(String[] args) {
        Method m1 = new Method();
        m1.method1();
        m1.method2();
        m1.method3();
        m1.method4();
    }
}

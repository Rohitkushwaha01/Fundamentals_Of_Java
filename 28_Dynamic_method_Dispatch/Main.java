// Dynamic method dispatch - Dynamic method dispatch is a mechanism to resolve overridden method call at run time instead of compile time. It is based on the concept of up-casting (A super class reference variable can refer subclass object.).

class Phone{
    public void on(){
        System.out.println("Turning on phone");
    }
    public void showTime(){
        System.out.println("showing time");
    }
}

class SmartPhone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning on Smartphone");
    }
    public void music(){
        System.out.println("playing music");
    }
}

public class Main {
    public static void main(String[] args) {
        // Phone obj = new Phone();
        // SmartPhone smobj = new SmartPhone();

        Phone obj = new SmartPhone();
        // SmartPhone obj2 = new Phone(); // not allowed
        obj.on();
        // obj.music(); // not allowed 
        // This is dynamic dispatch
    }
}

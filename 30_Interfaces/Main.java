// interface = means a object which connect to things such as TV is controlled by human the medium is remote so Remote behave as an interface between human and TV.

// Another way to achieve abstraction in Java, is with interfaces.
// interfaces has it own methods which is only declared not implemented this is to be implemented by the class who implements this interface(in our case, NatinoalCycle implements two interface Bicycle and Horn, and additionally it can implement it's own methods)

// Bicylce an Horn implemented together in one class this shows that we can implment one or more than one interface to a class.

// In the other hand, we cannot extend one class with more than one abstract class.

interface Bicycle{
    void applyBrake();
    void SpeedUp();
}

interface Horn{
    void HornCycle();
}

class NationalCycle implements Bicycle, Horn{

    //Constructor
    NationalCycle(){
        System.out.println("We are National Cycle");
    }

    // complusory method to be implement.
    public void applyBrake(){
        System.out.println("Applying Brake");
    }

    public void SpeedUp(){
        System.out.println("Speed up");
    }
    
    public void HornCycle(){
        System.out.println("Po pooo...., pe pee...");
    }

    // Additional method
    public void designCycle(){
        System.out.println("we designed cycle. Ps: additional method ");
    }
}

public class Main {
    public static void main(String[] args) {
        NationalCycle Branch_1 = new NationalCycle();
        Branch_1.HornCycle();
        Branch_1.SpeedUp();
        Branch_1.applyBrake();
        Branch_1.designCycle();
    }
}

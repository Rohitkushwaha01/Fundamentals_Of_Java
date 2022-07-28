// Inheritance = Taking methods and properties of one class into another class is called inheritance

class Base{
    public int x;
    
    public void setX(int x){
        this.x = x;
    }

    public int getX(){
        return x;
    }
}

// Use extends keyword to inherit the properties and methods of Base class
class Derived extends Base{
    public int y;
    
    public void setY(int y){
        this.y = y;
    }
    
    public int getY(){
        return y;
    }
}

public class Main {
    public static void main(String[] args) {
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());

        // Here in derive class setX and getX shows that they have the properties and methods of Base class.
        Derived d = new Derived();
        d.setX(45);
        d.setY(4);
        System.out.println(d.getX());
        System.out.println(d.getY());
    }
}

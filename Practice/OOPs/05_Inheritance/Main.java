

class Circle{
    public int radius;

    Circle(int r){
        this.radius = r;
    }

    public double area(){
        return (this.radius * this.radius * Math.PI);
    }
}

class Cylinder extends Circle{
    public int height;

    Cylinder(int r, int h){
        super(r);
        this.height = h;
    }

    public double Volume(){
        return (Math.PI * this.radius * this.radius * this.height);
    }
}

public class Main {
    public static void main(String[] args){
        // Circle CircleObj = new Circle();
        Cylinder cylinderObj = new Cylinder(2,4);
        System.out.println(cylinderObj.Volume());
    }    
}

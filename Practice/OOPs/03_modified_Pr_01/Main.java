//Create a class cylinder and use getters and setters to set its radius and height.


class Cylinder{
    private int radius, height;

    Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    public int getheight(){
        return height;
    }

    public int getradius(){
        return radius;
    }

}

public class Main {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(12, 5);
        System.out.println(myCylinder.getheight());
        System.out.println(myCylinder.getradius());
    }
}
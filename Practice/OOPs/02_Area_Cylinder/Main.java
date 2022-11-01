// create a classs cylinder and calculate surface area and volume of a cylinder using oops concept.

class Cylinder{
    private int radius, height;

    public void setHeight(int h){
        this.height =  h;
    }

    public void setRadius(int r){
        this.radius =  r;
    }

    public double surfaceArea(){
        double calSurface = (2 * Math.PI * radius * height) + (2 * Math.PI * radius * radius);
        return calSurface;
    }
    
    public double volume(){
        double calVolume =  Math.PI * radius * radius * height;
        return calVolume;
    }

}

public class Main {
    public static void main(String[] args) {
        Cylinder C1 = new Cylinder();
        C1.setHeight(4);
        C1.setRadius(5);
        System.out.println("The surface area of cylinder is : " + C1.surfaceArea()); 
        System.out.println("The surface area of cylinder is : " + C1.volume()); 
    }
}



import java.util.*;

class Rectangle{
    private double width, height, area;
    String color;

    Scanner sc = new Scanner(System.in);

    void get_height(){
        System.out.print("Enter length: ");
        height = sc.nextDouble();
    }

    void get_width(){
        System.out.print("Enter width: ");
        width = sc.nextDouble();
    }

    String get_color(){
        System.out.print("Enter Color: ");
        color = sc.next();
        return color;
    }

    double find_area(){
        double area = width * height;
        return area;
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.get_height();
        r1.get_width();
        r1.find_area();
        String color1 = r1.get_color();

        r2.get_height();
        r2.get_width();
        r2.find_area();
        String color2 = r2.get_color();

        if((r1.find_area()==r2.find_area()) && (color1.compareTo(color2) == 0)){
            System.out.println("matching found");
        }
        else{
            System.out.println("Matching Not Found");
        }
    }    
}

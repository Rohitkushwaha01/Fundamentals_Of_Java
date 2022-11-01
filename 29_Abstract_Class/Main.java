<<<<<<< HEAD
// abstract means existing in thought or as an idea without any physical existence.

// abstract Method = A method which is not been implemented just declared.
// abstra{ct class = A class which have abstract method, itself must be decalred as abstract class
// An object of an abstract class cannot be created.
// It is possible to create reference to an abstract class.

import java.util.Scanner;

abstract class Shape{
    Shape(){
        System.out.println("I have this Shapes: Rectangle, Circle");
    }
    abstract public float perimeter();
    abstract public int side();
    abstract public float Area();
}

class Rectangle extends Shape{
    Scanner sc = new Scanner(System.in);
    float length, width;

    public void sout(){
        System.out.print("Enter the length of Rectangle: ");
        length = sc.nextFloat();
        System.out.print("Enter the width of Rectangle: ");
        width = sc.nextFloat();
    }

    public float perimeter(){
        sout();
        return 2*(length + width);
    }

    public int side(){
        return 4;
    }
    
    public float Area(){
        sout();
        return length*width;
    }
}

class Circle extends Shape{
    Scanner sc = new Scanner(System.in);
    float radius;

    public void sout(){
        System.out.print("Enter the radius of Circle: ");
        radius = sc.nextFloat();
    } 

    public float perimeter(){
        sout();
        return (float) (2*(Math.PI * radius));
    }

    public int side(){
        return 0;
    }

    public float Area(){
        sout();
        return (float) (Math.PI * radius * radius);
    }
}

// the below class throws an error as it have method which is not declared in Shape abstract class
// class Triangle extends Shape{
//     public void Message(){
//         System.out.println(I'm a Triangle class);
//     }
// }

// If you want to inherit shape use abstract key to make this class an abstract class
// remember this is now abstract class means it's object cannot be created.
abstract class Triangle extends Shape{
    public void Message(){
        System.out.println("I'm a Triangle class");
    }
}

public class Main {
    public static void main(String[] args){
        // Shape rect = new Shape(); -- Error(due to abstract class)
        Rectangle r1 = new Rectangle();
        System.out.println("The Area of Rectangle is : " + r1.Area()); 
        System.out.println("The Perimeter of Rectangle is : " + r1.perimeter()); 
        System.out.println("The side of Rectangle is : " + r1.side()); 
        Circle c1 = new Circle();
        System.out.println("The Area of Circle is : " + c1.Area()); 
        System.out.println("The Perimeter of Circle is : " + c1.perimeter()); 
        System.out.println("The side of Circle is : " + c1.side());
    }
=======
// abstract means existing in thought or as an idea without any physical existence.

// abstract Method = A method which is not been implemented just declared.
// abstra{ct class = A class which have abstract method, itself must be decalred as abstract class
// An object of an abstract class cannot be created.
// It is possible to create reference to an abstract class.

import java.util.Scanner;

abstract class Shape{
    Shape(){
        System.out.println("I have this Shapes: Rectangle, Circle");
    }
    abstract public float perimeter();
    abstract public int side();
    abstract public float Area();
}

class Rectangle extends Shape{
    Scanner sc = new Scanner(System.in);
    float length, width;

    public void sout(){
        System.out.print("Enter the length of Rectangle: ");
        length = sc.nextFloat();
        System.out.print("Enter the width of Rectangle: ");
        width = sc.nextFloat();
    }

    public float perimeter(){
        sout();
        return 2*(length + width);
    }

    public int side(){
        return 4;
    }
    
    public float Area(){
        sout();
        return length*width;
    }
}

class Circle extends Shape{
    Scanner sc = new Scanner(System.in);
    float radius;

    public void sout(){
        System.out.print("Enter the radius of Circle: ");
        radius = sc.nextFloat();
    } 

    public float perimeter(){
        sout();
        return (float) (2*(Math.PI * radius));
    }

    public int side(){
        return 0;
    }

    public float Area(){
        sout();
        return (float) (Math.PI * radius * radius);
    }
}

// the below class throws an error as it have method which is not declared in Shape abstract class
// class Triangle extends Shape{
//     public void Message(){
//         System.out.println(I'm a Triangle class);
//     }
// }

// If you want to inherit shape use abstract key to make this class an abstract class
// remember this is now abstract class means it's object cannot be created.
abstract class Triangle extends Shape{
    public void Message(){
        System.out.println("I'm a Triangle class");
    }
}

public class Main {
    public static void main(String[] args){
        // Shape rect = new Shape(); -- Error(due to abstract class)
        Rectangle r1 = new Rectangle();
        System.out.println("The Area of Rectangle is : " + r1.Area()); 
        System.out.println("The Perimeter of Rectangle is : " + r1.perimeter()); 
        System.out.println("The side of Rectangle is : " + r1.side()); 
        Circle c1 = new Circle();
        System.out.println("The Area of Circle is : " + c1.Area()); 
        System.out.println("The Perimeter of Circle is : " + c1.perimeter()); 
        System.out.println("The side of Circle is : " + c1.side());
    }
>>>>>>> 26c03d1b1199838c2ed6953ba5776fb03accb5f9
}
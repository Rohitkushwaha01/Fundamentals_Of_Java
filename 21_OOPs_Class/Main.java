<<<<<<< HEAD
// Class - class is a blueprint
// In any java program there should be only one public class.


class Employee{
    int id;
    int Salary;
    public void printDetails(String Name){
        System.out.println("My Name is " + Name);
    }
}

// public class Can only be declared once in program 
public class Main {
    public static void main(String[] args) {
        // Instantiating a new Employee object
        Employee Rohit = new Employee();
        Employee Pooja = new Employee(); 

        // Setting Attributes/properties for Rohit
        Rohit.id = 12;
        Rohit.Salary = 40000;
        Rohit.printDetails("Rohit");
        System.out.println(Rohit.id);
        System.out.println(Rohit.Salary);

        // Setting Attributes/properties for Pooja
        Pooja.id = 2;
        Pooja.Salary = 50000;
        Pooja.printDetails("Pooja");
        System.out.println(Pooja.id);
        System.out.println(Pooja.Salary);
        
    }
}

=======
// Class - class is a blueprint
// In any java program there should be only one public class.


class Employee{
    int id;
    int Salary;
    public void printDetails(String Name){
        System.out.println("My Name is " + Name);
    }
}

// public class Can only be declared once in program 
public class Main {
    public static void main(String[] args) {
        // Instantiating a new Employee object
        Employee Rohit = new Employee();
        Employee Pooja = new Employee(); 

        // Setting Attributes/properties for Rohit
        Rohit.id = 12;
        Rohit.Salary = 40000;
        Rohit.printDetails("Rohit");
        System.out.println(Rohit.id);
        System.out.println(Rohit.Salary);

        // Setting Attributes/properties for Pooja
        Pooja.id = 2;
        Pooja.Salary = 50000;
        Pooja.printDetails("Pooja");
        System.out.println(Pooja.id);
        System.out.println(Pooja.Salary);
        
    }
}

>>>>>>> 26c03d1b1199838c2ed6953ba5776fb03accb5f9

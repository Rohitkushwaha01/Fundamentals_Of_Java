// Access Modifiers = Access modifiers specifies where a property is accessible 
// There are four access modifiers - public, private, protected, default.

// Public access modifier - methods and variables are accessible within the class as well as outside the class
// private access modifier - methods and variables are accessible within the class only not outside the class
// protected access modifier - methods and variables are only accessible to the friend of that class.
// Default access modifier - when someone don't specify any access specifier then default access specifier applied to that class (The default access modifier = private access modifier only accessible to the member of class not outside).

class MyEmployee{
    private String Name;

    public String getName(){
        return Name;
    }

    public void setName(String name){
        Name = name;
    }
}


public class Main {
    public static void main(String[] args) {
        MyEmployee E1 = new MyEmployee();
        // Rohit.Name = "Rohit";
        // The above code will throw an error because accessing private attribute
        E1.setName("Rohit Kushwaha");
        System.out.println(E1.getName());
    }
}

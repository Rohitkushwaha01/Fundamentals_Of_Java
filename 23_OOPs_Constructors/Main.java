// constructors = A member function used to initialize an object while creating it.
// constructor automatically invoke itself.
// constructor is like a special function of a class having same Name as of class Name.
// Constructor don't have any return type.
// We can overload constructor too

class MyMainEmployee{
    private String Name;
    private int id;
    //constructor - constructor name is same as of class name
    public MyMainEmployee(String myName, int myId){
        Name = myName;
        id = myId;
    }
    // constructor overloading
    public MyMainEmployee(String myName){
        Name = myName;
    }

    public String getName(){
        return Name;
    }

    public int getId(){
        return id;
    }

    // public void setName(String name){
    //     Name = name;
    // }

}


public class Main {
    public static void main(String[] args) {
        MyMainEmployee E1 = new MyMainEmployee("Pooja", 12);
        MyMainEmployee E2 = new MyMainEmployee("Rohit");

        System.out.println(E1.getName());
        System.out.println(E1.getId());
        System.out.println(E2.getName());
        // System.out.println(E2.getId()); // return 0 
    }
}

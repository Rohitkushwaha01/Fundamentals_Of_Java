// An enum is a special "class" that represents a group of constants 
// Enum is short for "enumerations", which means "specifically listed".
public class Main {

    enum medium{
        ENGLISH, 
        HINDI, 
        MARATHI,
        URDU
    }
    public static void main(String[] args) {
        medium which = medium.ENGLISH;
        System.out.println(which);
    }
}

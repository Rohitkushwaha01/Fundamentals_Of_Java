// Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.
// Some wrapper classes for primitive data types are as follows:
// int --> Interger
// double --> Double
// byte --> Byte
// short --> Short
// long --> Long
// boolean --> Boolean
// char --> Character

public class Main{
    public static void main(String[] args) {
        Integer num = 20;
        Double decimalNum = 20.3;
        Character name = 'R';
        System.out.println(num);
        System.out.println(decimalNum);
        System.out.println(name);
        System.out.println(num.intValue());
        System.out.println(decimalNum.intValue());
        System.out.println(num.floatValue());
        System.out.println(decimalNum.floatValue());
        String mystring = num.toString();
        System.out.println(mystring.length());
    }
}
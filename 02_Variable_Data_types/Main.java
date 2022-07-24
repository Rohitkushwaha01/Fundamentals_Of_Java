public class Main{
    public static void main(String[] args){
        byte var = 12;
        System.out.println(var);
        int var1 = 123;
        System.out.println(var1);
        long var2 = 343334444432222333l;
        System.out.println(var2);
        short var3 = 44;
        System.out.println(var3);
        float var4 = 34.34f; // Data type of any decimal number is double so we need to specify it's type by adding "f" literal at the end of the declared values.
        System.out.println(var4);
        double var5 = 44.34; // By default double no need to specify
        System.out.println(var5);
        String var6 = "Rohit";
        System.out.println(var6);
        char var7 = 'f';
        System.out.println(var7);
        boolean var8 = true;
        System.out.println(var8);
    }
}


/*

 * Variables are nothing but a container which stores some sort of data such as integer, decimal, string, characters.
 * Naming convention for a variable 
 * A variable can contain alphabets, underscore, dollar sign, digits
 * A variable doesn't have any special symbol accept $ and _
 * A variable can start from $ and _ 
 * Names in java are case-sensitibe (int var, int Var: this two are different in java)
 * A variable can't be reserved Keyword (int, char, public: this are not acceptable these are reserved in java)

 */

// Data types : Data types are nothing but a kind of data which a variable is holding 
// Data types are divided into two parts
// Primitive data type and non-primitive data types

// Primitive data type
// primitive data type tells us about the size of variabe and type of variable values. It has no methods.

// In java only 8 primitive data types are supported
// 1) int 
// 2) float
// 3) char
// 4) byte -> (hold 1byte data) range -128 to 128
// 5) long
// 6) short
// 7) double
// 8) boolean

// Non-primitive data type
// Non-primitve data type are called reference types because they refer to objects
// Non-primitive data type is user defined data type
// Non-primitive data type have methods
// Examples of non-primitive data types are String, array, classes, etc.


// If you don't won't anyone to overwrite a existing variable use "final" keyword (in java for constant variables we use final instead of const)
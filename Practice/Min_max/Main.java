<<<<<<< HEAD
public class Main{

    static void maxNumber(int num1, int num2){
        if(num1 > num2){
            System.out.println(num1 + " is greater than "+ num2);
        }
        else{
            System.out.println(num2 + " is greater than "+ num1);
        }
    }

    static void maxNumbe(int num1, int num2, int num3){
        if(num1 > num2){
            if (num1 > num3) {
                System.out.println(num1 + " is greater than "+ num2 + ", " + num3);
            }
            else{
                System.out.println(num3 + " is greater than "+ num1 + ", " + num2);
            }
        }
        else if(num2 > num1){
            if (num2 > num3) {
                System.out.println(num2 + " is greater than "+ num1 + ", " + num3);
            }
            else{
                System.out.println(num3 + " is greater than "+ num1 + ", " + num2);
            }
        }
        
    }
    public static void main(String[] args) {

        maxNumber(5,6);
        maxNumbe(5002,10000, 82002);

        
    }
=======
public class Main{

    static void maxNumber(int num1, int num2){
        if(num1 > num2){
            System.out.println(num1 + " is greater than "+ num2);
        }
        else{
            System.out.println(num2 + " is greater than "+ num1);
        }
    }

    static void maxNumbe(int num1, int num2, int num3){
        if(num1 > num2){
            if (num1 > num3) {
                System.out.println(num1 + " is greater than "+ num2 + ", " + num3);
            }
            else{
                System.out.println(num3 + " is greater than "+ num1 + ", " + num2);
            }
        }
        else if(num2 > num1){
            if (num2 > num3) {
                System.out.println(num2 + " is greater than "+ num1 + ", " + num3);
            }
            else{
                System.out.println(num3 + " is greater than "+ num1 + ", " + num2);
            }
        }
        
    }
    public static void main(String[] args) {

        maxNumber(5,6);
        maxNumbe(5002,10000, 82002);

        
    }
>>>>>>> 26c03d1b1199838c2ed6953ba5776fb03accb5f9
}
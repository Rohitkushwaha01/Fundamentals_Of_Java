<<<<<<< HEAD
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of English: ");
        int English = sc.nextInt();

        System.out.print("Enter marks of Maths: ");
        int Maths = sc.nextInt();

        System.out.print("Enter marks of Science: ");
        int Science = sc.nextInt();

        int total = English + Maths + Science;
        System.out.println(total);

        float percentage = (float)(total*100)/300;

        System.out.println(percentage);

        if(English>=33 && Maths>=33 && Science>=33){
            if(percentage >= 40){
                System.out.println("Congratulation!! You're passed with " + percentage + "%");
            }
            else{
                System.out.println("Sorry! You're not passed" + "You're percentage is " + percentage + "%");
            }
        }
        else{
            System.out.println("Sorry!! You're failed in one or more of the subjects");
        }

    }
}
=======
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of English: ");
        int English = sc.nextInt();

        System.out.print("Enter marks of Maths: ");
        int Maths = sc.nextInt();

        System.out.print("Enter marks of Science: ");
        int Science = sc.nextInt();

        int total = English + Maths + Science;
        System.out.println(total);

        float percentage = (float)(total*100)/300;

        System.out.println(percentage);

        if(English>=33 && Maths>=33 && Science>=33){
            if(percentage >= 40){
                System.out.println("Congratulation!! You're passed with " + percentage + "%");
            }
            else{
                System.out.println("Sorry! You're not passed" + "You're percentage is " + percentage + "%");
            }
        }
        else{
            System.out.println("Sorry!! You're failed in one or more of the subjects");
        }

    }
}
>>>>>>> 26c03d1b1199838c2ed6953ba5776fb03accb5f9

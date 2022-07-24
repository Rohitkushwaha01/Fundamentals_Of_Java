import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Calculator");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter marks of English");
        float English = scan.nextFloat();
        System.out.println("Enter marks of Marathi");
        float Marathi = scan.nextFloat();
        System.out.println("Enter marks of Hindi");
        float Hindi = scan.nextFloat();
        System.out.println("Enter marks of History");
        float History = scan.nextFloat();
        System.out.println("Enter marks of Geography");
        float Geography = scan.nextFloat();
        System.out.println("Enter marks of Science");
        float Science = scan.nextFloat();
        System.out.println("Enter marks of Maths");
        float Maths = scan.nextFloat();

        // System.out.println("The marks obtained in Each subjects are");;
        // System.out.println(English);
        // System.out.println(Marathi);
        // System.out.println(Hindi);
        // System.out.println(History);
        // System.out.println(Geography);
        // System.out.println(Science);
        // System.out.println(Maths);


        float sumOfMarks = English + Marathi + Hindi + History + Geography + Science + Maths;
        System.out.println(sumOfMarks);

        float percentage = (sumOfMarks*100)/700;
        System.out.print("Your percentage is : ");
        System.out.println(percentage);

    }
}
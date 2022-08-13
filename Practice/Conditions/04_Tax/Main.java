import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter your income in Lakhs per annum");
       float tax = 0;
       float income = sc.nextFloat();
       if(income<=2.5){
            tax = 0;
       }
       else if(income>250000 && income <= 500000){
            tax = (income*5)/100;
       }
       else if(income>500000 && income <= 1000000){
            tax = (income*20)/100;
       }
       else if(income>1000000){
            tax = (income*30)/100;
       }

       System.out.println("The total tax paid by the employee is: " + tax);
    }   
}

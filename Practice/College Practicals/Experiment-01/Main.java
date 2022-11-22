import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ch, i , num, n, sum, cnt, flag, fact;

        do{
            System.out.println("1: Find Factorial");
            System.out.println("2: Display first 50 Number");
            System.out.println("3: Find sum and average of N number");
            System.out.println("4: Exit");
            System.out.print("Enter you choice: ");
            ch = sc.nextInt();
            switch(ch){
                case 1: 
                    System.out.println("Enter Number: ");
                    n = sc.nextInt();
                    fact = 1;
                    for (int j = 1; j <= n; j++) {
                        fact = fact * j;
                        System.out.println("Factorial : " + fact);
                    }
                    break;
                case 2: 
                    for (int j = 0; j < 50; j++) {
                        if(j%2 != 0){
                            System.out.println(j);
                        }
                    }
                    break;
                case 3: 
                    System.out.println("Enter limit: ");
                    n = sc.nextInt();
                    sum = 0;
                    for (int j = 0; j < n; j++) {
                        System.out.println("Enter number: ");
                        num = sc.nextInt();
                        sum = sum + num;
                    }
                    System.out.println("Sum of the values Enter is : " + sum);
                    break;
                case 4: 
                    System.exit(0);
                    break;
                default: 
                    System.out.println("Wrong choice");
            }

        }
        while(ch!=4);
    }
}
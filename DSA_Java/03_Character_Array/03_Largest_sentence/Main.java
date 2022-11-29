import java.util.*;

import javax.xml.transform.SourceLocator;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of sentence: ");
        int n = sc.nextInt();
        sc.nextLine();

        String str;
        String largest = null;

        int largest_len = 0;

        while(n-- > 0){
            System.out.print("Enter sentence: ");
            str = sc.nextLine();

            int len = str.length();
            if(len > largest_len){
                largest_len = len;
                largest = str;
            }
        }
        
        System.out.println(largest);
    }
}

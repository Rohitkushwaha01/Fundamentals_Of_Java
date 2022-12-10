
import java.util.*;
public class Main {
    public static int romanToInt(String s) {
        char romanNotation[] = { 'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int numberNotation[] = {1, 5, 10, 50, 100, 500, 1000, 4, 9, 40, 90, 400, 900};
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < numberNotation.length; j++) {
                if(s.charAt(i)+s.charAt(i+1) == romanNotation[j]){
                    sum = sum + numberNotation[j];
                }
                else if (s.charAt(i) == romanNotation[j]) {
                    System.out.println(sum);
                    sum = sum + numberNotation[j];
                }
            }
            
        }
        
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        romanToInt("MICII");
    }
}

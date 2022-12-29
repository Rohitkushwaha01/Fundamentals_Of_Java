// Problem : print number into it's spelling
// input : 2021 output : two zero two one

public class Main{

    public static void printSpell(int n, String spell[]){
        if(n==0){
            return;
        }

        int lastDigit = n%10;
        printSpell(n/10, spell);
        System.out.print(spell[lastDigit] + " ");
    }

    public static void main(String[] args) {
        String spell[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        printSpell(265021, spell);
    }
}
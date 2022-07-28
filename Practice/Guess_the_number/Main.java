import java.util.Scanner;

class Game {
    public int randInt;
    public int UserInput;
    public int count = 0;

    public Game(){
        double randDouble = Math.round(20*(Math.random()));
        randInt = (int)randDouble;
        System.out.println(randInt);
    }

    public void takeUserInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you guessed number: ");
        UserInput = scan.nextInt();
    }

    public boolean isCorrect(){
        count++;
        if (UserInput == randInt) {
            System.out.print("You guessed it right");
            System.out.println(" in " + count + " counts");
            return true;
        } 
        else if(UserInput > randInt){
            System.out.println("it's too high");
        }
        else if(UserInput < randInt){
            System.out.println("it's too low");
        }
        return false;
    }

}


public class Main{
    public static void main(String[] args) {
        System.out.println("hello");
        Game G1 = new Game();
        boolean b = false;
        while(!b){
            G1.takeUserInput();
            b = G1.isCorrect();
        }
        
    }
}
// Password generator = just a simple one.

public class Main{
    public static void main(String[] args) {
        String[] Alphabets = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}; 
        double randomAlpha = 26*Math.random();
        int randAlpha = (int)randomAlpha;  


        String[] Symbol = {"!","@","#","$", "%","^","&","*","(",")","_","+"}; 
        double randomSymbol = 12*Math.random();
        int randSysmbol = (int)randomSymbol;  


        int[] Numbers = {1,2,3,4,5,6,7,8,9,0};
        double randomNumbers = 10*Math.random();
        int randNumbers = (int)randomNumbers;

        System.out.println(Alphabets[randAlpha] + Numbers[randNumbers] + Symbol[randSysmbol] +Alphabets[randNumbers] + Numbers[randSysmbol] + Symbol[randNumbers] + Alphabets[randSysmbol] + Symbol[randNumbers]);
        
    }
}
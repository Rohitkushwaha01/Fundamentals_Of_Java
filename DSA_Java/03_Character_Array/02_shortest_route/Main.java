import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String route;

        System.out.print("Enter route: ");
        route = sc.nextLine();

        System.out.println("Given route: "+route);

        int x = 0;
        int y = 0;
        for (int i = 0; i < route.length(); i++) {
            switch (route.charAt(i)) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
                default: 
                    System.out.println("Wrong input");
                    System.exit(0);
            }
        }

        System.out.println(x + " " + y);

        if(x>=0 && y>=0){
            while(x-- > 0){
                System.out.print("E");
            }
            while(y-- > 0){
                System.out.print("N");
            }
        }
        else{
            while(x++ < 0){
                System.out.print("W");
            }
            while(y++ < 0){
                System.out.print("S");
            }
        }

    }
}

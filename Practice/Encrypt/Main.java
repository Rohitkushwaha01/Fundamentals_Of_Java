// package Practice.Encrypt;
import java.util.Scanner;

public class Main {

    public static int encrypt(String password){
        int asciiPassword=0;
        for (int i = 0; i < password.length(); i++) {
            asciiPassword = (int)password.charAt(i);
            System.out.println(asciiPassword);
        }
        return asciiPassword;
    }

    public static void decrypt(int password){
        char originalPassword;
        for (int i = 0; i < 10; i++) {
            // originalPassword = (String)password.(i);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you password");
        String password = sc.next();

        int encryptedPassword = encrypt(password);
        System.out.println(encryptedPassword);
        decrypt(encryptedPassword);

    }
}
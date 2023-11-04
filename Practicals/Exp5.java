// 1st create a file with name PalindromeChecker and insert the below code in that file.
package Experiment_05;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PalindromeChecker extends Remote {
    boolean isPalindrome(String input) throws RemoteException;
}

// 2nd create a file with name PalindromeCheckerImpl and insert the below code in that file.
package Experiment_05;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PalindromeCheckerImpl extends UnicastRemoteObject implements PalindromeChecker {
    protected PalindromeCheckerImpl() throws RemoteException {
        super();
    }

    public boolean isPalindrome(String input) throws RemoteException {
        // Remove whitespace and convert to lowercase (for case-insensitive comparison)
        String sanitizedInput = input.replaceAll("\\s+", "").toLowerCase();
        
        // Check if the input is a palindrome
        int length = sanitizedInput.length();
        for (int i = 0; i < length / 2; i++) {
            if (sanitizedInput.charAt(i) != sanitizedInput.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

// 3rd create a file with name PalindromeServer and insert the below code in that file.

package Experiment_05;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class PalindromeServer {
    public static void main(String[] args) {
        try {
            // Create an instance of the implementation class
            PalindromeChecker palindromeChecker = new PalindromeCheckerImpl();
            
            // Start the RMI registry on the default port (1099)
            LocateRegistry.createRegistry(1099);
            
            // Bind the implementation class to a name in the registry
            Naming.rebind("PalindromeChecker", palindromeChecker);
            
            System.out.println("Palindrome server is running...");
        } catch (Exception e) {
            System.err.println("Palindrome server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

// 4th create a file with name PalindromeClient and insert the below code in that file

package Experiment_05;

import java.rmi.Naming;

public class PalindromeClient {
    public static void main(String[] args) {
        try {
            // Lookup the RMI service
            PalindromeChecker palindromeChecker = (PalindromeChecker) Naming.lookup("rmi://localhost/PalindromeChecker");
            
            // Test palindrome strings and numbers
            String[] inputs = { "radar", "level", "hello", "12321", "12345" };
            for (String input : inputs) {
                boolean isPalindrome = palindromeChecker.isPalindrome(input);
                System.out.println(input + " is palindrome? " + isPalindrome);
            }
        } catch (Exception e) {
            System.err.println("Palindrome client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}


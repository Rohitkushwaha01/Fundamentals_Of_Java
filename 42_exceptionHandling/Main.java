// The try statement allows you to define a block of code to be tested for errors while it is being executed.

// The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.

public class Main {
    public static void main(String[ ] args) {
      try {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]);
      } 
      catch (Exception e) {
        System.out.println("Something went wrong.");
      }
    }
  }
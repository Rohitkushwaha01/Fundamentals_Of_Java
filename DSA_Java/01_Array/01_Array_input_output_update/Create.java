public class Create {
  public static void main(String[] args) {

    int a[] = {1, 2, 4, 6, 3};
    int b[] = new int[10];
    String name[] = {"rohit", "pooja", "gaurav"};

    System.out.println("-----------------------------");
    
    // o/p each array element using forEach loop in java
    for (int x : a) {
        System.out.println(x);
    }

    System.out.println("-----------------------------");

    for (int i : b) {
        System.out.println(i);
    }

    System.out.println("-----------------------------");

    for (String string : name) {
        System.out.println(string);
    }
  }  
}

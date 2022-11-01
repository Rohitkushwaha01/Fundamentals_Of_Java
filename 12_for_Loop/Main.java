public class Main {
    public static void main(String[] args) {
        // for loop : used for looping 
        // use when you know exactly how many times you want to loop through
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        
        // For-each loop : used to loop through arrays.
        String[] arg = {"Rohit", "Pooja", "Shubham", "Gaurav"};
        for (String i: arg) {
            System.out.println(i);
        }
    }
}

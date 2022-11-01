// In java we can also pass as many parameter as we want 
// Here I have passed only one parameter
public class Main {
    static void myMethod(int i){
        System.out.println("I'm the methods that has been executed " + i + "time");
    }
    public static void main(String[] args) {
        myMethod(1);
        myMethod(2);
        myMethod(3);
    }
}


// public class Main {
//     static void myMethod(int i){
//         System.out.println("I'm the methods that has been executed " + i + " time");
//     }
//     public static void main(String[] args) {
//         for(int i = 1; i<=3; i++){
//             myMethod(i);
//         }
//     }
// }

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int array[] = new int[100];
        int num;
        
        System.out.print("Enter number of element in the array: ");
        num = sc.nextInt();

        // insert element;
        for (int i = 0; i < num; i++) {
            System.out.print("Enter Element " + i + ": ");
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        for (int i = 0; i < num; i++) {
            System.out.println(array[i]);
        }
    }
}

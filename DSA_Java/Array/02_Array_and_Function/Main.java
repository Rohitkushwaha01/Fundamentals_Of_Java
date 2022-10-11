// class arrayFunction{
//     public void printArray(int array[]){
//         System.out.println("In function");
// 		for (int i = 0; i < array.length; i++) {
//             System.out.println(array[i]);
//         }
//         array[2] = 4000;
//         array[5] = 4000;
// 	}
// }

public class Main {
    public static void printArray(int array[]) {
        System.out.println("In function");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        array[2] = 4000;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 22, 35, 48, 56, 64 };
        int n = arr.length;

        printArray(arr);

        System.out.println("In main");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

    }
}
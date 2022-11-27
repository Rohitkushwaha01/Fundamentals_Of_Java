// Given an integer vector and a bool variable flag, your task is to sort the vector in accordance to the boolean value. If the bool value passed is true then sort it in non-decreasing order or vice versa.
// You can use any sorting technique of your choice.

public class Main{
    public static void increasing(int arr[], int flag){
        if(flag == 1){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length-1; j++) {
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp; 
                    }
                }
            }
        }
        else{
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length-1; j++) {
                    if(arr[j] < arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp; 
                    }
                }
            }
        }
    }

    public static void traverse(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
    public static void main(String[] args) {
        int array[] = {4,32,5,6,3};
        increasing(array, 1);
        traverse(array);
        increasing(array, -1);
        System.out.println();
        traverse(array);

    }
}
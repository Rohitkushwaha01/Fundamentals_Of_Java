// Smallest Element
// Print the Smalles Element of an array
public class Main{
    public static int smallestElement(int arr[]){
        int smallestNumber = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i == 0) smallestNumber = arr[i];
            if(smallestNumber > arr[i]){
                smallestNumber = arr[i];
            }
        }
        return smallestNumber;
    }

    public static void main(String[] args) {
        int arr[] = {-4,2,5,0,-3,1};
        System.out.println(smallestElement(arr));
    }
}
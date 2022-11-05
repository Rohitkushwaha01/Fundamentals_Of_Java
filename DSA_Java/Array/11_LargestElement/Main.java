// Largest Element
// Print the largest Element of an array
public class Main {
    public static int largestElement(int arr[]) {
        int largest = 0;
        for(int i = 0; i < arr.length; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,23,2,10,5};
        System.out.print(largestElement(arr));
    }
}

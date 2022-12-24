public class Main{
    public static int remove(int arr[], int val) {
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != val ){
                arr[j] = arr[i];
                j++;
            }
        }

        return j;
    }
    public static void main(String[] args) {
        int arr[] = {34,1,4,56,3};

        remove(arr, 56);

        for(int i = 0; i < arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
}
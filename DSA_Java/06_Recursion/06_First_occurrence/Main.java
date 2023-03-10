public class Main {
    public static void first(int a[], int key, int i) {
        if (a.length == 1) {
            return;
        }

        if (a[i] == key) {
            System.out.println("Key is present at position " + (i+1));
            return;
        }
        else{
            first(a, key, i + 1);
        }
    }

    static int firstOcc(int i, int arr[],int n,int key){

        //base case
        if(i == n){
            return -1;
        }
        //rec case
        if(arr[i]==key){
            return 0;
        }
        int subIndex = firstOcc(i+1, arr, n, key);
        if(subIndex!=-1){
            return subIndex + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 3, 4, -1, 5, -12, 6, 1, 3 };
        int n = arr.length;
        int key = 6;
        // first(arr, -1, 0);
        System.out.println((firstOcc(0,arr,n,key))); 
    }
}

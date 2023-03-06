public class Main{
    public static void main(String[] args){
        int[] arr = {5,6,45,85,90,99};
        int target = 99;
        System.out.println(binarySearch(arr, target, 0, (arr.length - 1)));
    }

    public static int binarySearch(int[] arr, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(target < arr[m]){
            return binarySearch(arr, target, s, m-1);
        }
        return binarySearch(arr, target, m+1, e);
    }
}
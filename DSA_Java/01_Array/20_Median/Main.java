public class Main {
    public static void main(String[] args) {
        int[] arr1 = {3};
        int[] arr2 = {-2,-1};
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }
    static double findMedianSortedArrays(int arr1[], int[] arr2){
        // mergin two arrays
        int[] merge = merge(arr1, arr2);

        // getting the first median (use this median if array is odd)
        int m1 = (merge.length)/2;
        int m2 = 0;
        // if array is not odd then take two median (take previous value too as a median)
        if(merge.length % 2 == 0){
            m2 = m1 - 1;
        }else{

        }
        System.out.println(m1  + " " + m2);
        System.out.println(merge[m1] + " " + merge[m2]);
        if(merge[m1] == 0 || merge[m2] == 0){
            return (double)0.0000;
        }
        double m = (double)(merge[m1] + merge[m2])/2;
        return m;
    }

    static int[] merge(int arr1[], int[] arr2){
        int[] merge = new int[arr1.length + arr2.length];
        int length = arr1.length;
        for (int i = 0; i < length; i++) {
            merge[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merge[length] = arr2[i];
            length++;
        }   
        return merge;
    }
}
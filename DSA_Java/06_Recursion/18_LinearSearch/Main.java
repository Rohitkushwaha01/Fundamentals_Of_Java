public class Main {
    public static void main(String[] args) {
        int[] arr = {12,3,2,5,32,6};
        System.out.println( linearSearch(arr, 32, 0));
    }   

    static boolean linearSearch(int[] arr, int target, int i){
        if((arr[i] == target) || (linearSearch(arr, 3, i+1))){
            return true;
        }
        return false;
    }

}

// 12 == 3 .  
// 3==3 ;
// 2==3
// 5==3
// 32==3
// 6==3



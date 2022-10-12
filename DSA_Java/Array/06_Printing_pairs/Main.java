public class Main{
	static void printAllPairs(int array[], int n){
		for(int i = 0; i<n; i++){
            for (int j = i+1; j < n; j++) {
                System.out.println("(" + array[i] + ", " + array[j] + ")");
            }
        }
	}
	public static void main(String[] args){
		// int arr[] = {1,2,3,4};
		int arr[] = {10,20,30,40,50};
		int n = arr.length;

		printAllPairs(arr, n);	
	}
}



public class Main {
    static void countingSort(int a[]){
        //Largest Element
        int largest = -1;

        for(int i=0;i<a.length;i++){
            largest = Math.max(largest,a[i]);
        }

        //create a count array/vector
        int[] freq = new int[(largest+1)];

        //Update the freq array
        for(int i=0;i<a.length;i++){
            freq[a[i]]++;
        }

        //Put back the elements from freq into original array

        int j = 0;
        for(int i=0; i<=largest; i++){

            while(freq[i]>0){
                a[j] = i;
                freq[i]--;
                j++;
            }
        }
        return;

    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2};
        countingSort(arr);
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.print("]");
    }    
}

// Array - Array is used to store multiple data of the same data type in a single variable.


public class Main {
    public static void main(String[] args) {
        int[] NumArray = {1,2,3,4,5,6,7,8,9,0};
        String[] stringArray = {"Microcontroller", "Digital Communication", "JAVA", "Electromagnetics", "DBMS"};

        // looping to get all the elements present in an array 
        for (int i : NumArray) {
            System.out.println(i);
        }
        for (String i : stringArray) {
            System.out.println(i);
        }

        // Indexing in array starts from 0 
        System.out.println("The Number at index 0 is : " + NumArray[0]);
        System.out.println("The string at index 0 is : " +  stringArray[0]);
        System.out.println("The Number at index 0 is : " +  NumArray[5]);
        System.out.println("The string at index 0 is : " +  stringArray[2]);

        // ArrayName.lenght method
        System.out.println("The length of NumArray is : " + NumArray.length);
        System.out.println("The length of stringArray is : " + stringArray.length);

    }
}

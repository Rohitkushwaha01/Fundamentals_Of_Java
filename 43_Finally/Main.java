// finally statement lets you execute code, after try...catch, regardless of the result

public class Main{
    public static void main(String[] args) {
        try{
            System.out.println("I'm the try block");
            int arr[] = {1,2,3};
            System.out.println(arr[10]);
            System.out.println("I will not execute because error occured earlier");
        }
        catch(Exception e){
            System.out.println("I'm the catch block: Error occured");
        }
        finally{
            System.out.println("Whether error occured or not finally will always executed!");
        }
    }
}
// Pascal’s triangle is a triangular array of the binomial coefficients. Write a function that takes an integer value n as input and returns 2D array with first n lines of the Pascal’s triangle.

// Following are the first 5 rows of Pascal’s Triangle.

// 1
// 1 1
// 1 2 1
// 1 3 3 1
// 1 4 6 4 1

public class Main{
    public static void triangle(int n){
        int num = 1;
        int space = n;
        for(int i = 0; i < n; i++){
            for (int k = 1; k < space; k++) {
                System.out.print(" ");
            }
            num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num*(i-j)/(j+1);
            }
            space--;
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        triangle(5);
    }
}
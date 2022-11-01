<<<<<<< HEAD
import java.util.*;;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[100];
		int n; // number of Students user want to enter.
        
		System.out.println("Enter number of Students: ");
		n = sc.nextInt();
		
		// INPUT: Taking Data from the user
		for(int i = 1; i <= n; i++){
			System.out.println("Enter " + i + " Students Marks");
			marks[i] = sc.nextInt();
		}

		// OUTPUT: Printing the result.
		System.out.println("Output");
		for(int i = 1; i <= n; i++){
			System.out.print(marks[i] + " ");
		}

        // Update
        // marks[3] = 20;
		// System.out.println("Output");
        // for(int i = 1; i <= 99; i++){
		// 	System.out.print((marks[i]*2) + " ");
		// }
	}
}

// NOTE:  When array is not initialized it will print 0 as a value 

// Two ways to create an array 
// int array[] = new int[100];
=======
import java.util.*;;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int marks[] = new int[100];
		int n; // number of Students user want to enter.
        
		System.out.println("Enter number of Students: ");
		n = sc.nextInt();
		
		// INPUT: Taking Data from the user
		for(int i = 1; i <= n; i++){
			System.out.println("Enter " + i + " Students Marks");
			marks[i] = sc.nextInt();
		}

		// OUTPUT: Printing the result.
		System.out.println("Output");
		for(int i = 1; i <= n; i++){
			System.out.print(marks[i] + " ");
		}

        // Update
        // marks[3] = 20;
		// System.out.println("Output");
        // for(int i = 1; i <= 99; i++){
		// 	System.out.print((marks[i]*2) + " ");
		// }
	}
}

// NOTE:  When array is not initialized it will print 0 as a value 

// Two ways to create and array 
// int array[] = new int[100];
>>>>>>> 26c03d1b1199838c2ed6953ba5776fb03accb5f9
// int array[] = {1,2,3,4,5};
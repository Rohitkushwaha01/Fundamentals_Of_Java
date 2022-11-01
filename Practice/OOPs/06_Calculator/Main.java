<<<<<<< HEAD
import java.util.Scanner; 

class Calculation{
	public void Add(int Num1, int Num2) {
		System.out.println("Addition of number1 and number2 is : " + (Num1 + Num2));
	}
	public void Subtract(int Num1, int Num2) {
		System.out.println("Subtraction of number1 and number2 is : " + (Num1 - Num2));
	}
	
	public void Multiply(int Num1, int Num2) {
		System.out.println("Multiplication of number1 and number2 is : " + (Num1 * Num2));
	}
	public void Division(int Num1, int Num2) {
		System.out.println("Division of number1 and number2 is : " + (Num1 / Num2));
	}
	public void Remainder(int Num1, int Num2) {
		
		System.out.println("Remainder : " + (Num1 % Num2));
	}
}

public class Main{
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int choice;
			int Num1, Num2;
			do {
				System.out.println("1. Add");
				System.out.println("2. Subtract");
				System.out.println("3. Multiply");
				System.out.println("4. Divide");
				System.out.println("5. Factorial");
				System.out.println("6. Exit");
				System.out.println("Enter you choice");
				choice = sc.nextInt();
				Calculation Num = new Calculation();
				
				System.out.println("Enter your first Number");
				Num1 = sc.nextInt();
				
				System.out.println("Enter your second Number");
				Num2 = sc.nextInt();
				
				switch(choice) {
					case 1:
						Num.Add(Num1, Num2);
						break;
					case 2:
						Num.Subtract(Num1, Num2);
						break;
					case 3:
						Num.Multiply(Num1, Num2);
						break;
					case 4:
						Num.Division(Num1, Num2);
						break;
					case 5:
						Num.Remainder(Num1, Num2);
						break;
					case 6:
						System.out.println("Terminating");
						break;
					default:
						System.out.println("Wrong choice");
				}
				
			}while(choice!=6);
	}
}
=======
import java.util.Scanner; 

class Calculation{
	public void Add(int Num1, int Num2) {
		System.out.println("Addition of number1 and number2 is : " + (Num1 + Num2));
	}
	public void Subtract(int Num1, int Num2) {
		System.out.println("Subtraction of number1 and number2 is : " + (Num1 - Num2));
	}
	
	public void Multiply(int Num1, int Num2) {
		System.out.println("Multiplication of number1 and number2 is : " + (Num1 * Num2));
	}
	public void Division(int Num1, int Num2) {
		System.out.println("Division of number1 and number2 is : " + (Num1 / Num2));
	}
	public void Remainder(int Num1, int Num2) {
		
		System.out.println("Remainder : " + (Num1 % Num2));
	}
}

public class Main{
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int choice;
			int Num1, Num2;
			do {
				System.out.println("1. Add");
				System.out.println("2. Subtract");
				System.out.println("3. Multiply");
				System.out.println("4. Divide");
				System.out.println("5. Factorial");
				System.out.println("6. Exit");
				System.out.println("Enter you choice");
				choice = sc.nextInt();
				Calculation Num = new Calculation();
				
				System.out.println("Enter your first Number");
				Num1 = sc.nextInt();
				
				System.out.println("Enter your second Number");
				Num2 = sc.nextInt();
				
				switch(choice) {
					case 1:
						Num.Add(Num1, Num2);
						break;
					case 2:
						Num.Subtract(Num1, Num2);
						break;
					case 3:
						Num.Multiply(Num1, Num2);
						break;
					case 4:
						Num.Division(Num1, Num2);
						break;
					case 5:
						Num.Remainder(Num1, Num2);
						break;
					case 6:
						System.out.println("Terminating");
						break;
					default:
						System.out.println("Wrong choice");
				}
				
			}while(choice!=6);
	}
}
>>>>>>> 26c03d1b1199838c2ed6953ba5776fb03accb5f9

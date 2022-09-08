package Rohit;
import java.util.Scanner;

class player{
	String name;
	int age;
	String skill;
}

class Cricket_player extends player{}

class Football_player extends player{}

class Hockey_player extends player{}

public class Inheritance {
	
	public static void main(String[] args) {
		Cricket_player c1 = new Cricket_player();
		Football_player f1 = new Football_player();
		Hockey_player h1 = new Hockey_player();
		Scanner read = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter your choice: 1) Fill 2) show 3)Exit ");
			int options1 = read.nextInt(); 
			switch(options1) {
				case 1:
					System.out.println("Enter your choice: 1) Cricket 2) football 3) Hockey ");
					int options2 = read.nextInt(); 
				
					switch(options2) {
						case 1:
							System.out.println("Enter the Name: ");
							c1.name = read.next();
							System.out.println("Enter the skill: ");
							c1.skill = read.next();
							System.out.println("Enter the age: ");
							c1.age = read.nextInt();
							break;
						case 2:
							System.out.println("Enter the Name: ");
							f1.name = read.next();
							System.out.println("Enter the skill: ");
							f1.skill = read.next();
							System.out.println("Enter the age: ");
							f1.age = read.nextInt();
							break;
						case 3:
							System.out.println("Enter the Name: ");
							h1.name = read.next();
							System.out.println("Enter the skill: ");
							h1.skill = read.next();
							System.out.println("Enter the age: ");
							h1.age = read.nextInt();
							break;
						case 4:
							System.out.println("Exit");
							break;
						default:
							System.out.println("Wrong Choice");
					}
					break;
				case 2:
					System.out.println("Whose details would you like to see: 1) Cricket 2) football 3) Hockey ");
					int options3 = read.nextInt();
					System.out.println("Here are your Filled Details:");
					switch(options3) {
						case 1:
							System.out.println(c1.name);
							System.out.println(c1.skill);
							System.out.println(c1.age);
							break;
						case 2:
							System.out.println(c1.name);
							System.out.println(c1.skill);
							System.out.println(c1.age);
							break;
						case 3:
							System.out.println(c1.name);
							System.out.println(c1.skill);
							System.out.println(c1.age);
							break;
						case 4:
							System.out.println("Exit");
							break;
						default:
							System.out.println("Wrong Choice");
					}
					break;
				case 3: 
					System.exit(0);
					break;
				default:
					System.out.println("Wrong Choice");
					break;
			}
		}
	}


}
















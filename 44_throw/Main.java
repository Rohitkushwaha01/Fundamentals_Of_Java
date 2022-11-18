public class Main {
    public static void party(int age){
        try{
            if(age > 18){
                System.out.println("Welcome! Access granted");
            }
            else{
                System.out.println("Such a kid, Access denied!!");
                throw new ArithmeticException("Access denied - You must be at least 18 years old.");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
        party(18);
        party(19);
        party(50);
    }
}

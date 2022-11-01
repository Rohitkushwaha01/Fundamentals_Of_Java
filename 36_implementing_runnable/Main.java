<<<<<<< HEAD
// Implementing runnable interface 

// In threading the code is executed concurrently.


class MyRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<40){
            System.out.println("I am a thread not a threat");
        }
    }
}

class MyRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<40){
            System.out.println("I am a thread2 not a threat2");
        }
    }
}

public record Main() {
    public static void main(String[] args) {
        MyRunnable1 bullet1 = new MyRunnable1();
        MyRunnable2 bullet2 = new MyRunnable2();
        // bullet1.start(); // cannot run start method in runnable interface. 
        // bullet2.start(); // Produce an error.
        
        Thread Gun1 = new Thread(bullet1);
        Thread Gun2 = new Thread(bullet2);
        
        Gun1.start();
        Gun2.start();
    }    
}
=======

// Implementing runnable interface 

// In threading the code is executed concurrently.


class MyRunnable1 implements Runnable{
    public void run(){
        int i = 0;
        while(i<40){
            System.out.println("I am a thread not a threat");
        }
    }
}

class MyRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<40){
            System.out.println("I am a thread2 not a threat2");
        }
    }
}

public record Main() {
    public static void main(String[] args) {
        MyRunnable1 bullet1 = new MyRunnable1();
        MyRunnable2 bullet2 = new MyRunnable2();
        // bullet1.start(); // cannot run start method in runnable interface. 
        // bullet2.start(); // Produce an error.
        
        Thread Gun1 = new Thread(bullet1);
        Thread Gun2 = new Thread(bullet2);
        
        Gun1.start();
        Gun2.start();
    }    
}
>>>>>>> 26c03d1b1199838c2ed6953ba5776fb03accb5f9

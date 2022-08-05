// Multithreading = Threads allows a program to operate more efficiently by doing multiple things at the same time.

// Threads can be used to perform complicated tasks in the background without interrupting the main program.

// In threading the code is executed concurrently.

class MyThread extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<40){
            System.out.println("This code is running in a thread");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<40){
            System.out.println("thread 2 is good");
            i++;
        }
    }
}


public class Main {    
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        MyThread2 thread2 = new MyThread2();

        // At a time both threads will run simultanously - multiple task is running at once.
        thread.start(); // for some time this code is executed
        thread2.start(); // and for some time this code is executed.
    }
}

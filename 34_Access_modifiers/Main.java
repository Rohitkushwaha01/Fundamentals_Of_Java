// Access modifier define how a vairable, method should be accessible or to whom the data is accessible.

class Demo{
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;

    void meth1(){
        System.out.println("--------------------------Method 1(Class)--------------------------");
        System.out.println("public a = " + a);
        System.out.println("protected b = " + b);
        System.out.println("default c = " + c);
        System.out.println("private d = " + d);
    }
}

class childDemo extends Demo{
    void meth2(){
        System.out.println("--------------------------Method 2(Subclass)--------------------------");
        System.out.println("public a = " + a);
        System.out.println("protected b = " + b);
        System.out.println("default c = " + c);
        // System.out.println("private d = " + d); // cannot access protected 
    }
}

public class Main{
    public static void main(String[] args) {
        childDemo d = new childDemo();
        d.meth1();
        d.meth2();
        System.out.println("------------------------------------Main-------------------------------");
        System.out.println("public a = " + d.a);
        System.out.println("protected b = " + d.b);
        System.out.println("default c = " + d.c);
        // System.out.println("private d = " + d.d); // private not accessible
    }
}



// Access modifiers in java 

/*
 * modifiers * class * package's * sub-class * World *
 * ----------------------------------------------------
 * public    *  yes  *    yes    *    yes    *  yes  * 
 * -----------------------------------------------------
 * protected *  yes  *    yes    *    yes    *   NO  * 
 * -----------------------------------------------------
 * default   *  yes  *    yes    *    NO     *   NO  * 
 * -----------------------------------------------------
 * private   *  yes  *    NO     *    NO     *   NO  * 
 * -----------------------------------------------------
 */
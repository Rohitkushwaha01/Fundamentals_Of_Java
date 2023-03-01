public class Main{
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(4);
        list.insertFirst(54);
        list.insertFirst(75);
        list.insertFirst(50);
        list.insert(40, 54);
        list.display();
        System.out.println();
        list.displayReverse();
    }

}

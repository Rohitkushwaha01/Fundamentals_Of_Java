// This program demonstrate how we can pass ArrayList to a function and do operation on it and get the value from that function.

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static int add(ArrayList<Integer> listA){
        int Added = 0;
        for (int i = 0; i < listA.size(); i++) {
            Added += listA.get(i);
        }
        return Added;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        list.add(4);
        list.add(5);
        list.add(8);
        list.add(7);
        list.add(6);
        System.out.print(add(list));
    }
}
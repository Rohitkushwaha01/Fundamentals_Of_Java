// You are given two 32-bit numbers, N and M, and two bit positions i and j.
// write a method to set all bits between i and j in N equal to M
// M {becomes a substring of N locationed at and starting at j}

import java.util.*;

public class Main {
    public static int clearRangeOfithBit(int n, int i, int j){
        int a = ((~0)<< j+1);
        int b = (1 << i) - 1;
        int mask = a|b;
        n =  (n & mask);
        return n;
    }
    public static int replaceBits(int n, int i, int j, int m){
        n = clearRangeOfithBit(n, i, j);
        int mask = (m<<i);
        n = n | mask;
        return n;
    }
    public static void main(String[] args) {
        int number = 15;
        int i = 1;
        int j = 3;
        int m = 2;
        number = replaceBits(number, i, j, m);
        System.out.println(number);
    }
}

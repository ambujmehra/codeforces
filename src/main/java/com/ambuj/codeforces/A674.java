package com.ambuj.codeforces;

import java.util.Scanner;

public class A674 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            System.out.println(getFloor(n,x));
        }
    }

    public static int getFloor(int n, int x) {
        if (n==1 || n==2)
            return 1;
        return 1 + (n-2)/x + ((n-2)%x!=0?1:0);
    }
}

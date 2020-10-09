package com.ambuj.codeforces;

import java.util.Scanner;

public class A165 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++) {
            int a = sc.nextInt();
            String ans = 360 % (180-a) ==0 ? "YES":"NO";
            System.out.println(ans);
        }
    }
}

package com.ambuj.codeforces;

import java.util.Scanner;

public class BetaA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        long ans1 = n/a + (n%a>0?1:0);
        long ans2 = m/a + (m%a>0?1:0);
        System.out.println(ans1*ans2);
    }
}

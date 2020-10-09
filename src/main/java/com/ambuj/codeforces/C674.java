package com.ambuj.codeforces;

import java.util.Scanner;

public class C674 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=0;i<t;i++) {
            int ans = Integer.MAX_VALUE;
            int n = sc.nextInt();
            for (int x=1;x*x<=n;x++) {
                ans = Math.min(ans, x-1 + ((n - x) + x - 1) / x );
            }
            System.out.println(ans);
        }
    }
}

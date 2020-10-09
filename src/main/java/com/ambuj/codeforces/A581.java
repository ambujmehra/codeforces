package com.ambuj.codeforces;

import java.util.Scanner;

public class A581 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean isPowerOf4 = true;
        for (int i=1;i<s.length();i++) {
            if (s.charAt(i) == '1') {
                isPowerOf4 = false;
                break;
            }

        }
        int count = (s.length()-1)/2;
        int ans = isPowerOf4 ? s.length()/2 : count+1;
        System.out.println(ans);

    }
}

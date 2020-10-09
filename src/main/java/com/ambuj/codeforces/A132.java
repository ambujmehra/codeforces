package com.ambuj.codeforces;

import java.util.Scanner;

public class A132 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i=0;i<n;i++) {
            nArr[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] mArr = new int[m];
        for (int i=0;i<m;i++) {
            mArr[i] = sc.nextInt();
        }
        int ans = Integer.MIN_VALUE;
        int count = 0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if (mArr[j]%nArr[i]==0) {
                    int temp = mArr[j]/nArr[i];
                    if (temp>ans) {
                        ans = temp;
                        count=1;
                    } else if (temp ==ans)
                        count++;
                }
            }
        }

        System.out.println(count);
    }
}

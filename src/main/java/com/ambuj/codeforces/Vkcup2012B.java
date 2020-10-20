package com.ambuj.codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vkcup2012B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> map= new HashMap<>();
        for (int i=0;i<n;i++) {
            int s = sc.nextInt();
            map.put(s, map.getOrDefault(s,0)+1);
        }
        int ans = 0;
        // all 4
        ans += map.getOrDefault(4,0);
        map.put(4,0);

        // 3 and 1
        int groupOf1And3 = Math.min(map.getOrDefault(3,0), map.getOrDefault(1,0));
        ans += groupOf1And3;
        map.put(1, map.getOrDefault(1,0)-groupOf1And3);
        map.put(3, map.getOrDefault(3,0)-groupOf1And3);

        // 2and 2
        int group2 = map.getOrDefault(2,0)/2;
        ans += group2;
        map.put(2,map.getOrDefault(2,0)%2);

        // 2,1,1
        int group211 = Math.min(map.getOrDefault(2,0), map.getOrDefault(1,0)/2);
        ans += group211;
        map.put(1,map.getOrDefault(1,0) - group211*2);
        map.put(2, map.getOrDefault(2,0)-group211);

        //1,1,1,1
        int group1111 = map.get(1)/4;
        ans += group1111;
        map.put(1, map.getOrDefault(1,0)%4);

        //1,1,1
        int group111 = map.get(1)/3;
        ans += group111;
        map.put(1, map.getOrDefault(1,0)%3);

        //1,1
        int group11 = map.get(1)/2;
        ans += group11;
        map.put(1, map.getOrDefault(1,0)%2);

        //2,1
        int group21 = Math.min(map.getOrDefault(2,0), map.getOrDefault(1,0));
        ans += group21;
        map.put(1,map.getOrDefault(1,0) - group21);
        map.put(2, map.getOrDefault(2,0)-group21);

        for (Map.Entry<Integer, Integer> e: map.entrySet())
            ans +=e.getValue();

        System.out.println(ans);
    }
}

package com.ambuj.codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Intersection of 2 arrays (one is very big) 
public class Tekion1 {

    //logic
    static int[] loadChunksOfSize(int[] m) {
       return null;
    }

    static boolean binarySearch(int[] n, int target) {
        int l=0;
        int r = n.length-1;
        while(l<=r) {
            int mid = (l + r) / 2;
            if (n[mid] == target)
                return true;
            if (n[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return false;
    }

    static List<Integer> performIntersection(int[]n, int[] m) {
        Arrays.sort(n);
        int pointM = 0;
        List<Integer> res = new ArrayList<>();
        while (pointM < m.length) {
            int[] chunk = loadChunksOfSize(m);
            for (int i=0;i<chunk.length;i++) {
                if (binarySearch(n, chunk[i]))
                    res.add(chunk[i]);
            }
            pointM +=chunk.length;
        }
        return res;
    }

    public static void main(String[] args) {
        //m>>>n
        // sort array of size n
        // load chuncks of size n from SDD
        // Binary search element in log(n)
        // mlog(n) ~ m
        int[] m = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] n = new int[]{1,2,3};

        performIntersection(m,n);

    }
}

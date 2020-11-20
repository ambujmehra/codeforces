package com.ambuj.codeforces.tekion;

public class Tekion2 {

    //1, 2, 7, 5, 1, 14, -7   
    // Maximum possible sum of elements such that no two elements are adjacent.  Answer - 1 +7+ 14 

    static int maxSum(int[] arr) {
        int pIncl = arr[0];
        int pExcl = 0;
        for (int i=1;i<arr.length;i++) {
            int inclI = pExcl+arr[i];
            int exclI = pIncl;
            pIncl = Math.max(pIncl,inclI);
            pExcl = Math.max(pExcl, exclI);
        }

        return Math.max(pExcl,pIncl);
    }
    public static void main(String[] args) {
        // i, sum - dp sum array which maintains this constraint till i-1
        //incl => sum[i-2] + arr[i]
        //excl => sum[i-1]
        // sum[i] => max(excl, incl)

        //p_excl,p_incl
        // incl_i = p_excl+arr[i]
        // excl_i = p_incl
        int[] arr = new int[]{1,2,7,5,1,14,-7};
        System.out.println(maxSum(arr));
    }
}

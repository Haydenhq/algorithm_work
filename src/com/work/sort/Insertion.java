package com.work.sort;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author：xhquan
 * @Project：algorithm_work
 * @since：2023/7/20 14:52
 */
public class Insertion {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 4, 2, 3, 6, 12, 45, 23, 78, 23, 4, 78, 12};
        int tmp = 0;
        for (int i = 1; i < nums.length; i++) {
            tmp = nums[i];
            for (int i1 = 0; i1 < i + 1; i1++) {
                if ( tmp < nums[i + 1]) {

                }
            }
        }


        List<Integer> list = new ArrayList<>();
//        test(list, 6);
        sout("ASDFG");
    }

    public static int test(List<Integer> list, int n) {
        if (n == 1) {
            return 1;
        }
        int a = test(list, (n - 1)) * n;
        System.out.println(a);
        return a;
    }

    public static void sout(String str) {
        if (str.length() == 0) {
            return;
        }
        sout(str.substring(str.length() - 1));
        System.out.println(str);
    }
}

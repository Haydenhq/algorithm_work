package com.work.sort;

/**
 * @Author：xhquan
 * @Project：algorithm_work
 * @since：2023/7/20 13:58
 */
public class Selection {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 3, 4, 2, 3, 6, 12, 45, 23, 78, 23, 4, 78, 12};

        int max;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            max = nums[i];
            for (int i1 = i; i1 < nums.length; i1++) {
                if (max < nums[i1]) {
                    max = nums[i1];
                    index = i1;
                }
            }
            nums[index] = nums[i];
            nums[i] = max;
        }

        System.out.println("result");
        for (int num : nums) {
            System.out.print(num + "\t");
        }
        System.out.println();
    }
}

package com.work.sort;

/**
 * @Author：xhquan
 * @Project：algorithm_work
 * @since：2023/7/20 11:14
 */
public class Bubble {
    public static void main(String[] args) {

        int[] nums = new int[]{2, 3, 4, 2, 3, 6, 12, 45, 23, 78, 23, 4, 78, 12};
        boolean flag = true;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }

        System.out.println("result");
        for (int num : nums) {
            System.out.print(num + "\t");
        }
        System.out.println();

    }
}

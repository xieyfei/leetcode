package com.xie.leetcode.removeduplicates26;

import java.util.Arrays;

public class RemoveDuplicates26_4 {

    public static void main(String[] args) {
//        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        int[] nums = {0,0,0,0,3};
//        int[] nums = {1,1};
        int[] nums = {1};
//        System.out.println(findNextDiffPos(nums, 0, 1, nums.length - 1));
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int actPos = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[actPos]) {
                nums[++actPos] = nums[i];
            }
        }
        return actPos + 1;
    }
}

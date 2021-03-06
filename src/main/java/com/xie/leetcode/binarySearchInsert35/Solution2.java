package com.xie.leetcode.binarySearchInsert35;

public class Solution2 {

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] nums = {1,3,5,6};
        System.out.println(s.searchInsert(nums, 5));
//        System.out.println(s.searchInsert(nums, 2));
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

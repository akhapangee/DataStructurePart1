/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.util;

/**
 *
 * @author Akhilesh
 */
public class SearchSort {

    public static boolean search(int[] nums, int n) {
        for (int i = 0; i < nums.length;
                i++) {
            if (n == nums[i]) {
                return true;
            }
        }
        return false;
    }

    public static int[] sort(int[] nums, boolean order) {
        //using bubble sort
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (order == true) {
                    if (nums[i] > nums[j]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                } else {
                    if (nums[i] < nums[j]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }

        return nums;
    }
}

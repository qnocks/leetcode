package com.qnocks.leetcode.topinterviewquestions.array

/**
 *  https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

fun removeDuplicates(nums: IntArray): Int {
    var idx = 1;

    for (i in 0 until nums.size - 1) {
        if (nums[i] != nums[i + 1]) {
            nums[idx++] = nums[i + 1];
        }
    }

    return idx;
}

fun main() {
    val nums = intArrayOf(1, 1, 2);
    removeDuplicates(nums)
}

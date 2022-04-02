package com.qnocks.leetcode.topinterviewquestions.array

/**
 *  https://leetcode.com/problems/move-zeroes/
 */

fun moveZeroes(nums: IntArray): Unit {
    val n = nums.size

    if (n == 0 || n == 1) {
        return;
    }

    var left = 0; var right = 0; var temp = 0;

    while (right < n) {
        if (nums[right] == 0) {
            right++
        } else {
            temp = nums[right]
            nums[right] = nums[left]
            nums[left] = temp
            right++
            left++
        }
    }
}

fun main() {
    val nums = intArrayOf(0, 1, 0, 3, 12)
    moveZeroes(nums)
    nums.forEach { print("$it ") }
}

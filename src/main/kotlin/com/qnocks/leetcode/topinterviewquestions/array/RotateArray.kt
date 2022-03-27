package com.qnocks.leetcode.topinterviewquestions.array

/**
 *  https://leetcode.com/problems/rotate-array/
 */

fun rotate(nums: IntArray, k: Int) {
    val count = k % nums.size
    reverse(nums, 0, nums.size - 1)
    reverse(nums, 0, count - 1)
    reverse(nums, count, nums.size - 1)
}

fun reverse(nums: IntArray, start: Int, end: Int) {
    var startVar = start
    var endVar = end

    while (startVar < endVar) {
        val temp = nums[startVar]
        nums[startVar] = nums[endVar]
        nums[endVar] = temp
        startVar++
        endVar--
    }
}

fun main() {
    val nums = intArrayOf(1, 2, 2, 4)
    rotate(nums, 2)
}

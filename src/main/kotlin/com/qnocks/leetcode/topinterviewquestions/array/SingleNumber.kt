package com.qnocks.leetcode.topinterviewquestions.array

/**
 *  https://leetcode.com/problems/single-number/
 */

fun singleNumber(nums: IntArray): Int {
    var result = 0
    for (num in nums) {
        result = result xor num
    }
    return result
}

fun main() {
    val nums = intArrayOf(1, 2, 2, 4)
    singleNumber(nums)
}

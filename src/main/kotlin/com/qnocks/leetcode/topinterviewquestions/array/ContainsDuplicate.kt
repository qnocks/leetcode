package com.qnocks.leetcode.topinterviewquestions.array

import java.util.*

/**
 *  https://leetcode.com/problems/contains-duplicate/
 */

// First approach
fun containsDuplicate1Approach(nums: IntArray): Boolean {
    val set = mutableSetOf<Int>()
    for (num in nums) {
        if (set.contains(num)) return true
        set.add(num)
    }

    return false
}

// Second approach
fun containsDuplicate2Approach(nums: IntArray): Boolean {
    Arrays.sort(nums)
    for (i in 0 until nums.size - 1) {
        if (nums[i] == nums[i + 1]) return true
    }

    return false
}

fun main() {
    val nums = intArrayOf(1, 2, 2, 4)
    containsDuplicate1Approach(nums)
    containsDuplicate2Approach(nums)
}

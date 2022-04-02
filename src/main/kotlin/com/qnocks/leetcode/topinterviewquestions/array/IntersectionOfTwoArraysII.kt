package com.qnocks.leetcode.topinterviewquestions.array

/**
 *  https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */


fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    val length1 = nums1.size
    val length2 = nums2.size
    val result = IntArray(length1 * length2)
    var i = 0
    var j = 0
    var k = 0

    nums1.sort()
    nums2.sort()

    while (i < length1 && j < length2) {
        when {
            nums1[i] < nums2[j] -> {
                i++
            }
            nums1[i] > nums2[j] -> {
                j++
            }
            else -> {
                result[k++] = nums1[i++]
                j++
            }
        }
    }

    return result.copyOfRange(0, k);
}

fun main() {
    val nums1 = intArrayOf(1, 2, 2, 1)
    val nums2 = intArrayOf(2, 2)
    intersect(nums1, nums2).forEach { print("$it ") }
}

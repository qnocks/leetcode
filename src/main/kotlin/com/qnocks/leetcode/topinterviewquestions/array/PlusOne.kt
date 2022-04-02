package com.qnocks.leetcode.topinterviewquestions.array

/**
 *  https://leetcode.com/problems/plus-one/
 */

fun plusOne(digits: IntArray): IntArray {
    val n = digits.size

    for (i in n - 1 downTo  0) {
        if (digits[i] < 9) {
            digits[i]++
            return digits
        }

        digits[i] = 0;
    }

    val newNumber = IntArray(n + 1)
    newNumber[0] = 1;
    return newNumber
}

fun main() {
    val digits = intArrayOf(9, 9, 9)
    plusOne(digits).forEach { print("$it ") }
}

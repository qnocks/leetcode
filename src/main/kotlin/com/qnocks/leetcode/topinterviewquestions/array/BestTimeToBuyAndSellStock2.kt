package com.qnocks.leetcode.topinterviewquestions.array

/**
 *  https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 */

fun maxProfit(prices: IntArray): Int {
    var max = 0

    for (i in 0 until prices.size - 1) {
        if (prices[i] < prices[i + 1]) {
            max += prices[i + 1] - prices[i]
        }
    }

    return max
}

fun main() {
    val prices = intArrayOf(1, 1, 2)
    maxProfit(prices)
}

package com.qnocks.leetcode.topinterviewquestions.strings

fun reverseString(s: CharArray) {
    var start = 0
    var end = s.size - 1

    while (start < end) {
        val temp = s[start]
        s[start] = s[end]
        s[end] = temp

        start++
        end--
    }
}

fun main() {
    val s = "Hello"
    reverseString(s.toCharArray())
}

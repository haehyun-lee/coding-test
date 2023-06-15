class Solution {
    fun solution(n: Int): Int {
        var i = 1
        var acc = 1
        while (acc * i <= n)
            acc *= ++i
        return if (n == 1) 1 else i
    }
}
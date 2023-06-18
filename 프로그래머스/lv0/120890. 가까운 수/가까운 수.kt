import kotlin.math.abs

class Solution {
    fun solution(array: IntArray, n: Int): Int {
        var list = array.toMutableList()
        list.add(n)
        list.sort()
        val nPos = list.indexOf(n)

        return when (nPos) {
            0 -> list[1]
            list.lastIndex -> list[list.lastIndex - 1]
            else -> {
                val diff1 = abs(list[nPos - 1] - n)
                val diff2 = abs(list[nPos + 1] - n)
                if (diff1 < diff2) {
                    list[nPos - 1]
                } else if (diff1 > diff2) {
                    list[nPos + 1]
                } else {
                    minOf(list[nPos - 1], list[nPos] + 1)
                }
            }
        }
    }
}
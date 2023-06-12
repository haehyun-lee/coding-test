class Solution {
    fun solution(array: IntArray): IntArray {
        val max = array.maxOf { it }
        return intArrayOf(max, array.indexOf(max))
    }
}
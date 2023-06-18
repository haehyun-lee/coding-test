class Solution {
    fun solution(emergency: IntArray): IntArray {
        val sortedDes = emergency.sortedDescending()
        return emergency.map { sortedDes.indexOf(it) + 1 }.toIntArray()
    }
}
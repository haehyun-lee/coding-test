class Solution {
    fun solution(score: Array<IntArray>): IntArray {
        val avgList = score.map { it.average() }
        val sortedList = avgList.sortedDescending()
        return avgList.map { sortedList.indexOf(it) + 1 }.toIntArray()
    }
}
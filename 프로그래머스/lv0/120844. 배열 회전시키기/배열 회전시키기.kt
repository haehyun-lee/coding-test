class Solution {
    fun solution(numbers: IntArray, direction: String): IntArray {
        var answer = mutableListOf<Int>()
        when (direction) {
            "right" -> {
                answer.add(numbers.last())
                answer.addAll(numbers.slice(0 until numbers.lastIndex))
            }
            "left" -> {
                answer.addAll(numbers.slice(1..numbers.lastIndex))
                answer.add(numbers.first())
            }
        }
        return answer.toIntArray()
    }
}
class Solution {
    fun solution(my_string: String): String {
        var answer = mutableListOf<Char>()
        my_string.forEach { if (answer.indexOf(it) == -1) answer.add(it) }
        return answer.joinToString("")
    }
}
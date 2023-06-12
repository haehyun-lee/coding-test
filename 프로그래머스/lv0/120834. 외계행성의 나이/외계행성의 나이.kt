class Solution {
    fun solution(age: Int): String {
        val alpha = charArrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j')
        return age.toString().split("").filter(String::isNotEmpty)
            .map { alpha[it.toInt()] }.joinToString("")
    }
}
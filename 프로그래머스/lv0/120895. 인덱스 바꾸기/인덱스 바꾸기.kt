class Solution {
    fun solution(my_string: String, num1: Int, num2: Int): String = my_string.toCharArray().let {
        val temp = it[num1]
        it[num1] = it[num2]
        it[num2] = temp
        it.joinToString("")
    }
}
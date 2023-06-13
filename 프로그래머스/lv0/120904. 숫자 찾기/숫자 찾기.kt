class Solution {
    fun solution(num: Int, k: Int): Int = num.toString()
        .map(Char::digitToInt)
        .indexOf(k).let {
            if (it != -1) it + 1
            else it
        }
}
class Solution {
    fun solution(i: Int, j: Int, k: Int): Int =
        (i..j).map(Int::toString).sumOf { s -> s.count { it.digitToInt() == k } }
}
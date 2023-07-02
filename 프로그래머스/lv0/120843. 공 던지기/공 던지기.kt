class Solution {
    fun solution(numbers: IntArray, k: Int): Int {
        var pos: Int = 0

        for (i in 2..k) {
            pos += 2
            if (pos > numbers.lastIndex) {
                pos -= numbers.size
            }
        }

        return numbers[pos]
    }
}
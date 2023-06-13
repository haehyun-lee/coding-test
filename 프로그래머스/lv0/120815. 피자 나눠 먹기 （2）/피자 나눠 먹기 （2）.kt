class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        // 최대 1인 1판(6조각)
        for (i in 1..n) {
            if ((6 * i) % n == 0) {
                answer = i
                break
            }
        }
        return answer
    }
}
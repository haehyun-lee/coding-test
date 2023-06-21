import java.util.*

class Solution {
    fun solution(s: String): Int {
        val stack = Stack<Int>()

        for (w in s.split(" ".toRegex())) {
            if (w == "Z") {
                stack.pop()
            } else {
                stack.push(w.toInt())
            }
        }

        return stack.sum()
    }
}
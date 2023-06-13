class Solution {
    fun solution(order: Int): Int = 
        order.toString().split("").filter { it.isNotEmpty() && it != "0" }
        .map(String::toInt).count { it % 3 == 0 }
}
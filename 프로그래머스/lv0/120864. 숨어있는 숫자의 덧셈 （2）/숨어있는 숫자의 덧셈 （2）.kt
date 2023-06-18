class Solution {
    fun solution(my_string: String): Int = 
        my_string.split(Regex("[A-Za-z]+")).filter(String::isNotEmpty).sumOf(String::toInt)
}
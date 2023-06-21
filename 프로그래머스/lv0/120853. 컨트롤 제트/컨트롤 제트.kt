class Solution {
    fun solution(s: String): Int {
        val temp = s.split(" ").toMutableList()
        for (i in temp.indices){
            if (temp[i] == "Z") {
                temp[i] = "0"
                temp[i - 1] = "0"
            }
        }
        return temp.map(String::toInt).sum()
    }
}
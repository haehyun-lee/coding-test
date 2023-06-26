class Solution {
    fun solution(my_str: String, n: Int): Array<String> {
        val strList = arrayListOf<String>()
        for (i in 0..my_str.lastIndex step n) {
            if (i + n > my_str.lastIndex) {
                strList.add(my_str.substring(i))
            } else {
                strList.add(my_str.substring(i until i+n))
            }
        }
        return strList.toTypedArray()
    }
}
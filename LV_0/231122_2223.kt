class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        
        answer = (num1.toDouble() / num2.toDouble() * 1000).toInt()
        
        return answer
    }
}
class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        
        var mok = 0
        
        if (n%2 == 0) {
            mok = n/2
        } else {
            mok = (n-1)/2
        }
        
        for (i in 1 .. mok) {
           answer += 2 * i
        }
        
        return answer
    }
}
class Solution {
    fun solution(dots: Array<IntArray>): Int {
        
        var answer: Int = 0
        
        var x1 = dots[0][0]
        var x2 = dots[1][0]
        var x3 = dots[2][0]
        var x4 = dots[3][0]
        
        var y1 = dots[0][1]
        var y2 = dots[1][1]
        var y3 = dots[2][1]
        var y4 = dots[3][1]
        
        var hor1 = (y2-y1) / (x2-x1)
        var hor2 = (y1-y4) / (x3-x4)
        
        var ver1 = (y1-y2) / (x3-x2)
        var ver2 = (y4-y1) / (x4-x1)
        
        if ( (hor1 == hor2) || (ver1 == ver2) ) {
            answer = 1
        } else {
            answer = 0
        }
        
        return answer
    }
}
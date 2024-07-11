class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(n == m) {
            if(eq.equals("=")) return 1;
        }
        if(ineq.equals(">")) {
            if(n > m) return 1;
        } else {
            if(n < m) return 1;
        }
        return answer;
    }
}
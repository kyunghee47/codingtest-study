class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {0, 0};
        int numer3 = numer1 * denom2 + numer2 * denom1;
        int denom3 = denom1 * denom2;
        if(numer3 % denom3 == 0) {
            answer[0] = numer3 / denom3;
            answer[1] = 1;
        } else {
            for(int i = numer3; i > 1; i--) {
                if(numer3 % i == 0 && denom3 % i == 0) {
                    numer3 /= i;
                    denom3 /= i;
                }
            }
            answer[0] = numer3;
            answer[1] = denom3;
        }
        return answer;
    }
}
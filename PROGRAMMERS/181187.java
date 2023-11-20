class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;
        long in = (long)r1 * r1;
        long out = (long)r2 * r2;
        
        for(int i = 1; i < r2; i++){
            long now = (long)Math.sqrt(out - ((long)i * i));
            answer += now;
        }
        
        for(int i = 1; i < r1; i++){
            double now = Math.sqrt(in - ((long)i * i));
            answer -= (long)now;
            if(Math.floor(now) == now){
                answer++;
            }
        }
        
        answer += r2 - r1 + 1;
        answer *= 4;
        
        return answer;
    }
}
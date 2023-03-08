// 12912
class Programmers_12912 {
    public long solution(int a, int b) {
        
        // big, small 설정
        long answer = 0;
        int big = Math.max(a, b);
        int small = Math.min(a, b);
        
        
        // 두 정수 사이의 합
        for(int i = small; i <= big; i++){
            answer += i;
        }
        return answer;
    }
}
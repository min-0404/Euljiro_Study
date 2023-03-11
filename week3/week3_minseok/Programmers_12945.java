package week3.week3_minseok;

// 피보나치 수
class Programmers_12945 {
    public int solution(int n) {
        
        // 배열 생성 & 초기값 설정
        int[] fibo = new int[n+1];
        fibo[0] = 0;
        fibo[1] = 1;
        
        // DP 진행 
        for(int i = 2; i <= n; i++){
            int answer = fibo[i-1] + fibo[i-2];
            fibo[i] = answer % 1234567; // int 값 초과 방지를 위해 1234567 나눈 값 저장
        }
        
        return fibo[n];
    }
    public static void main(String[] args) {
        Programmers_12945 programmers_12945 = new Programmers_12945();
        System.out.println(programmers_12945.solution(10));
    }
}
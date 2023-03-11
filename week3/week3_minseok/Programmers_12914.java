package week3.week3_minseok;
import java.util.*;

// 멀리 뛰기: 전형적인 DP
class Programmers_12914 {
    public long solution(int n) {
        
        // 초기 설정
        int[] dp = new int[2001];
        dp[1] = 1;
        dp[2] = 2;
        
        
        // DP 수행
        for(int i=3; i<2001; i++){
          dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }
        
        return dp[n];
    }

    public static void main(String[] args) {
        Programmers_12914 programmers_12914 = new Programmers_12914();
        System.out.println(programmers_12914.solution(4));
    }
}

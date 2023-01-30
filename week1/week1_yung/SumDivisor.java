package week1.week1_yung;

import java.util.Scanner;

// 약수의 합
public class SumDivisor {

    public int solution(int n) {

        int i = 1, ans = 0;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                ans += i;
                if (i != Math.sqrt(n)) {
                    ans += n / i;
                }
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumDivisor sumDivisor = new SumDivisor();
        System.out.println(sumDivisor.solution(sc.nextInt()));
        sc.close();
    }
}

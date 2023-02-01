package week2.week2_yung;

import java.util.Scanner;

// 자릿수 더하기
public class DigitNumSum {

    public int solution(int n) {

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DigitNumSum digitNumSum = new DigitNumSum();
        System.out.println(digitNumSum.solution(sc.nextInt()));
        System.out.println(digitNumSum.solution(sc.nextInt()));

        sc.close();
    }
}

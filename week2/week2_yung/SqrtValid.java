package week2.week2_yung;

import java.util.Scanner;

public class SqrtValid {

    public long solution(long n) {

        double num = Math.sqrt(n);
        if (num == (int) num) {
            long ans = (long) num + 1;
            return ans * ans;
        }
        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SqrtValid sqrtValid = new SqrtValid();
        System.out.println(sqrtValid.solution(sc.nextLong()));
        sc.close();
    }
}

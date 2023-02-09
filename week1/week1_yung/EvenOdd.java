package week1.week1_yung;

import java.util.Scanner;

// 짝수와 홀수
public class EvenOdd {

    public String solution(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EvenOdd evenOdd = new EvenOdd();
        System.out.println(evenOdd.solution(sc.nextInt()));
        System.out.println(evenOdd.solution(sc.nextInt()));
        sc.close();
    }
}
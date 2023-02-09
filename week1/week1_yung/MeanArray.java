package week1.week1_yung;

import java.util.Arrays;
import java.util.Scanner;

// 평균 구하기
public class MeanArray {

    public double solution(int[] arr) {
        return (double) Arrays.stream(arr).sum() / arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        MeanArray meanArray = new MeanArray();
        System.out.println(meanArray.solution(arr));
        sc.close();
    }
}

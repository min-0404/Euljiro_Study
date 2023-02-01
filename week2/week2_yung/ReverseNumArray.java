package week2.week2_yung;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumArray {

    public int[] solution(long n) {

        int[] arr = new int[11];
        int i = 0;
        while (n > 0) {
            arr[i++] = Long.valueOf(n % 10).intValue();
            n /= 10;
        }
        System.out.println();
        return Arrays.copyOfRange(arr, 0, i);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ReverseNumArray reverseNumArray = new ReverseNumArray();
        long n = sc.nextLong();
        int[] ans = reverseNumArray.solution(n);
        for (int ele : ans) {
            System.out.print(ele + " ");
        }
        sc.close();
    }
}

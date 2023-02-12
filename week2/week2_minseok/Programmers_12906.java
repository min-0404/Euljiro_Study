package week2.week2_minseok;
import java.util.*;

// 12906
public class Programmers_12906 {

    public int[] solution(int []arr) {
        
        // List생성하고 & 첫번째 원소 삽입
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        
        // 조건탐색하며 List에 삽입
        for(int i = 1 ; i < arr.length; i ++){ 
            if(arr[i] != arr[i-1]) list.add(arr[i]);
        }

        // 결과처리(List -> 배열)
        int[] answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }

    public static void main(String[] args) {
        HateSameNumber hateSameNumber  = new HateSameNumber();
        int[] arg = {1,1,2,2,2,3};
        System.out.println(hateSameNumber.solution(arg).toString());
    }
}
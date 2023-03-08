import java.util.*;

// 1845
class Programmers_1845 {
    public int solution(int[] nums) {
        
        // 최대값 설정
        int max = nums.length / 2;
        
        // 세트 채우기
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums){
            hashSet.add(num);
        }
        
        // 결과값 처리
        if(hashSet.size() >= max) return max;
        else return hashSet.size();
    }


    public static void main(String args[]){
        Programmers_1845 programmers_1845 = new Programmers_1845();
        int[] nums = {1,2,3,4};
        System.out.println(programmers_1845.solution(nums));        
    }
}



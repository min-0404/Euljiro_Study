import java.util.*;

class Poketmon {
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
}



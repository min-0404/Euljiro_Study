package week4.week4_minseok;
import java.util.*;

public class Programmers_131128 {

    public String solution1(String X, String Y){
        
        // 초기설정
        StringBuilder sb = new StringBuilder();
        int[] xArr =  new int[10];
        int[] yArr =  new int[10];

        // X, Y에 담긴 정수들 split해서 arr에 옮김
        for(String s : X.split("")){
            xArr[Integer.parseInt(s)]++;
        }
        for(String s : Y.split("")){
            yArr[Integer.parseInt(s)]++;
        }

        //메인 작업: 9 ~ 0 까지 탐색하면서 sb에 append해주기
        for(int i = 9 ; i  > 0 ; i --){
            while(xArr[i] > 0 && yArr[i] > 0){
                xArr[i]--;
                yArr[i]--;
                sb.append(i); // StringBuilder엔 아무 자료형 다 추가 가능
            }
        }

        // 결과 처리
        if(sb.toString().equals("")) return "-1";
        else if(sb.toString().substring(0,1).equals("0")) return "0";
        else return sb.toString(); 
    }

    public String solution2(String X, String Y){

        // 초기 설정
        Map<String, Integer> xMap = new HashMap<>();
        Map<String, Integer> yMap = new HashMap<>();
        List<String> list = new ArrayList<>();

        // Map 채우기
        for(String s : X.split("")){
            xMap.put(s, xMap.getOrDefault(s, 0) + 1); 
        }
        for(String s : Y.split("")){
            yMap.put(s, yMap.getOrDefault(s, 0) + 1);
        }

        // 메인 작업: 2개의 Map에서 공통된 key 있으면 그걸로 숫자 만들기
        for(String key : xMap.keySet()){
            
            // 없을 시
            if(!yMap.containsKey(key)) continue;

            // 있을 시
            int length = Math.min(xMap.get(key), yMap.get(key));
            for(int i = 0; i < length; i++){
                list.add(key);
            }
        }

        // list 역순 정렬하고, String으로 변환
        Collections.sort(list, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(String s : list) sb.append(s);
        
        // 결과 처리
        if(sb.toString().equals("")) return "-1";
        else if(sb.toString().substring(0, 1).equals("0")) return "0";
        else return sb.toString();
        
    }
    
}

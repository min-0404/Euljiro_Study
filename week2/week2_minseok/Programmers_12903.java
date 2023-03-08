package week2.week2_minseok;

// 12903
class Programmers_12903 {
    public String solution1(String s) {
        
        // 초기값 설정
        String answer = "";
        int len = s.length();
        
        // 홀수일때
        if (len % 2 !=0){
            answer += s.charAt(len / 2);
        }
        // 짝수일때
        else{
            answer += s.charAt(len / 2 - 1);
            answer += s.charAt(len / 2);
        }
        
        return answer;
    }
    public String solution2(String s){
        
        // 초기값 설정
        String answer = "";
        int len = s.length();
        
        // 홀수일때
        if (len % 2 != 0){
            answer += s.substring(len / 2, len / 2 + 1);
        }
        
        // 짝수일때
        else{
            answer += s.substring(len / 2 - 1, len / 2 + 1 );
        }
        return answer;
    }
}
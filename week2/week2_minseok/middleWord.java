package week2.week2_minseok;

class middleWord {
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

    public static void main(String[] args) {
        middleWord middleWord = new middleWord();
        System.out.println(middleWord.solution1("abcd"));
        System.out.println(middleWord.solution2("abcde"));
    }
}
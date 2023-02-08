import java.util.*;
import java.time.*;

class Year2016 {
    public String solution(int a, int b) {
        
        // 날짜 데이터 설정
        String[] days = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] dates = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // 총 일수 더하기
        int total = 0;
        for(int i = 0; i < a-1; i++) total += dates[i];
        total += (b - 1);
        
        // 결과 처리
        String answer = days[total % 7];
        return answer;
    }


    public String solution2(int a, int b){
        
        // LocalDate 활용
        return LocalDate.of(2016, a, b).getDayOfWeek().toString().substring(0, 3);
    }

    public String solution3(int a, int b){
        
        // 캘린더 클래스 활용
        Calendar calendar = Calendar.getInstance();
        calendar.set(2016, a-1, b);
        int dayNum = calendar.get(Calendar.DAY_OF_MONTH);

        // 결과 처리
        String day = "";
        switch(dayNum){
            case 1 : day = "SUN";
            break;
            case 2: day = "MON"; 
		 	break; 
		 	case 3: day = "TUE"; 
		 	break; 
		 	case 4: day = "WED"; 
		 	break; 
		 	case 5: day = "THU"; 
		 	break; 
		 	case 6: day = "FRI";
		 	break; 
		 	case 7: day = "SAT"; 
            break; 
        }
        return day;
    }



    public static void main(String[] args) {
        Year2016 solution = new Year2016();
        System.out.println(solution.solution(4, 4));
        System.out.println(solution.solution2(4, 4));
        System.out.println(solution.solution3(4, 4));
    }
}
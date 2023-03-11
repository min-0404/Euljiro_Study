package week3.week3_minseok;
import java.util.*;

class Programmers_12952 {
    
    // 미리 선언
    static int[] board;
    static int answer = 0;
    
    public int solution(int n) {
        board = new int[n];
        nqueen(0, n);
        return answer;
    }
    
    public void nqueen(int row, int n){
        
		// 종결조건
		if (row == n) {
			answer++;
			return;
		}
        
        // 수행동작
        for(int i = 0; i < n; i++){
            board[row] = i; // 일단 둬보기
            if (check(row)) nqueen(row+1, n);
        }
    }
    
    public boolean check(int row){
        
        // 적합한지 체크
        for(int i = 0; i < row; i++){
            if (board[i] == board[row] || Math.abs(row - i) == Math.abs(board[row] - board[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Programmers_12952 programmers_12952 = new Programmers_12952();
        System.out.println(programmers_12952.solution(4));
    }
}

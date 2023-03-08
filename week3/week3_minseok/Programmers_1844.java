package week3.week3_minseok;

import java.util.*;

// 게임 맵 최단거리
class Programmers_1844 {
    
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, 1, -1};
    
    public int solution(int[][] maps) { 
        
        // 가로, 세로 길이로 visited 생성
        int n = maps.length;
        int m = maps[0].length;
        int[][] visited = new int[n][m];
        
        // BFS 수행
        int answer = 0;
        BFS(maps, visited, n, m);
        answer = visited[n-1][m-1];
        
        // 결과 처리
        if(answer == 0) return -1;
        else return answer;
    }
    
    public void BFS(int[][] maps, int[][] visited, int n, int m){
        
        // 큐 생성 & 시작점 처리
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {0, 0});
        visited[0][0] = 1;

        
        // 메인 동작
        while(!q.isEmpty()){
            
            // 큐의 맨앞 꺼내기
            int[] pair = q.remove();
            int cx = pair[0];
            int cy = pair[1];
            
        
            for(int i = 0; i < 4; i++){
                int nx = cx + dx[i];
                int ny = cy + dy[i];
                
                // 부적합한 경우 -> 이 로직 없으면 에러나는데 왜...???
                if(nx < 0 || nx > n - 1 || ny < 0 || ny > m - 1)
                    continue;
                             
                // 적합한 경우
                if (maps[nx][ny] == 1 && visited[nx][ny] == 0){
                    visited[nx][ny] = visited[cx][cy] + 1;
                    q.add(new int[] {nx, ny});
                }
            }
        }
    }

    public static void main(String[] args) {
        Programmers_1844 programmers_1844 = new Programmers_1844();
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        System.out.println(programmers_1844.solution(maps));
    }
}
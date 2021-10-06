https://yoloaeee.tistory.com/130

============================================================
  
  
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main
{
    public static void bfs(int[][] map, boolean[][] visit, int[] start, int n, int m)
    {
        Queue<int[]> q = new LinkedList<int[]>();
        int[][] dir = new int[][]{{1,0},{0,1},{-1,0},{0,-1}}; // 상하좌우 방향으로 탐색
        int x = start[0];
        int y = start[1];
        visit[x][y] = true;
        q.add(start);
        
        // bfs 실행
        while(!q.isEmpty())
        {
            // 기준좌표 설정
            x = q.peek()[0];
            y = q.peek()[1];
            q.poll();
            
            // 미리 설정한 4방향 확인
            for(int i=0; i<dir.length; i++)
            {
                // 다음 이동할 좌표 설정(Queue에 삽입해서 탐색할 좌표)
                x += dir[i][0];
                y += dir[i][1];
                
                // 최대,최소 범위 안에 있고 + 방문하지 않았고 + 이동할 수 있는 좌표일 경우 만족
                if(x<n && y<m && x>=0 && y>=0 && !visit[x][y] && map[x][y]!=0)
                {
                    visit[x][y] = true;
                    q.add(new int[]{x,y});
                    map[x][y] = map[x-dir[i][0]][y-dir[i][1]]+1;
                }
                
                // 다음 방향을 확인하기 위해 반복문 전 기준좌표로 설정
                x -= dir[i][0];
                y -= dir[i][1];
            }
        }
        
        // 결과출력
        System.out.println(map[n-1][m-1]);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[n][m];
        boolean[][] visit = new boolean[n][m];
        
        // map 2차원 배열에 0, 1 값 설정
        for(int i=0; i<n; i++)
        {
            String input = sc.next();
            
            for(int j=0; j<input.length(); j++)
            {
                map[i][j] = Integer.parseInt(input.charAt(j)+"");
            }
        }
        
        // 0, 0 시작좌표로 bfs 실행
        bfs(map, visit, new int[]{0,0}, n, m);
    }
}

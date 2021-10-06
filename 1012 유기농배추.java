https://yoloaeee.tistory.com/131

======================================================
  

import java.util.Stack;
import java.util.Scanner;

public class Main
{
    // dfs를 실행할 때마다 +1되는 static 변수 worm(테스트케이스마다 0으로 초기화)
    static int worm = 0;
    
    public static void dfs(int[][] map, boolean[][] visit, int[] start, int m, int n)
    {
        worm++;
        Stack<int[]> s = new Stack<int[]>();
        int[][] dir = new int[][]{{1,0},{0,1},{-1,0},{0,-1}}; // ↓, → 방향으로만 탐색
        int x = start[0];
        int y = start[1];
        visit[x][y] = true;
        s.push(start);
        
        // dfs 실행
        while(!s.isEmpty())
        {
            // 기준좌표 설정
            x = s.peek()[0];
            y = s.peek()[1];
            s.pop();
            
            // 미리 설정한 2방향만큼 반복
            for(int i=0; i<dir.length; i++)
            {
                // 다음 이동할 좌표 설정(Stack에 삽입해서 탐색할 좌표)
                x += dir[i][0];
                y += dir[i][1];
                
                // 최대,최소 범위 안에 있고 + 방문하지 않았고 + 이동할 수 있는 좌표일 경우 만족
                if(x<m && y<n && x>=0 && y>=0 && !visit[x][y] && map[x][y]==1)
                {
                    visit[x][y] = true;
                    s.add(new int[]{x,y});
                }
                
                // 다음 방향을 확인하기 위해 반복문 전 기준좌표로 설정
                x -= dir[i][0];
                y -= dir[i][1];
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0; i<t; i++)
        {
            worm = 0; // 벌레는 테스트케이스마다 0으로 갱신
            int n = sc.nextInt();
            int m = sc.nextInt();
            int baechu = sc.nextInt();
            
            int[][] map = new int[m][n];
            boolean[][] visit = new boolean[m][n];
            
            for(int j=0; j<baechu; j++)
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                map[y][x] = 1;
            }
            
            for(int x=0; x<m; x++)
            {
                for(int y=0; y<n; y++)
                {
                    if(map[x][y]==1 && !visit[x][y])
                    {
                        // 1이 최초로 발견될 때 시작좌표로 dfs 실행
                        dfs(map, visit, new int[]{x,y}, m, n);
                    }
                }
            }
            
            System.out.println(worm);
        }
    }
}

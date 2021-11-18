https://yoloaeee.tistory.com/193

====================================
  
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class Main
{
    // 전후좌우, 대각선 4방향 고려
    static int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    
    public static int[] makeArea(int[][] map, boolean[][] visit, int[] start, int n, int m)
    {
        // BFS 실행
        Queue<int[]> q = new LinkedList<int[]>();
        q.add(start);
        int cnt = 0;

        while(!q.isEmpty())
        {
            cnt++;
            int[] temp = q.poll();
            int y = temp[0];
            int x = temp[1];
            visit[y][x] = true;
            
            for(int i=0; i<dir.length; i++)
            {
                y += dir[i][0];
                x += dir[i][1];
                
                if(y>=0 && y<n && x>=0 && x<m && !visit[y][x] && map[y][x]==0)
                {
                    visit[y][x] = true;
                    q.add(new int[]{y,x});
                }
                
                y -= dir[i][0];
                x -= dir[i][1];
            }
        }
        
        return new int[]{1,cnt};
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // x좌표
        int n = sc.nextInt(); // y좌표
        int k = sc.nextInt(); // k개의 직사각형 영역
        
        int cnt = 0; // 영역의 개수
        ArrayList<Integer> list = new ArrayList<Integer>(); // 영역별 넓이
        
        // BFS 실행을 위한 배열 및 변수 기본설정
        int[][] map = new int[m][n];
        boolean[][] visit = new boolean[m][n];

        for(int i=0; i<k; i++)
        {
            int startx = sc.nextInt();
            int starty = sc.nextInt();
            int endx = sc.nextInt();
            int endy = sc.nextInt();
            
            for(int j=starty; j<endy; j++)
            {
                for(int p=startx; p<endx; p++)
                {
                    map[j][p] = 1;
                }
            }
        }
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(map[i][j]==0 && !visit[i][j])
                {
                    int[] temp = makeArea(map, visit, new int[]{i, j}, m, n);
                    cnt += temp[0];
                    list.add(temp[1]);
                }
            }
        }
        
        Collections.sort(list); // 영역넓이 오름차순 정렬
        System.out.println(cnt);
       
        for(int d : list)
        {
            System.out.println(d + " ");
        }
       
        sc.close();
    }
}

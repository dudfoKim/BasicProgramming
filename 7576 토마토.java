https://yoloaeee.tistory.com/196

====================================

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main
{
    // 전후좌우 4방향을 고려
    static int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    
    // BFS를 이용해 box에 값 채우기
    public static int makeMature(Queue<int[]> q, int[][] box, int n, int m)
    {
        while(!q.isEmpty())
        {
            int[] temp = q.poll();
            int y = temp[0];
            int x = temp[1];
            int day = box[y][x];
            
            for(int i=0; i<dir.length; i++)
            {
                y += dir[i][0];
                x += dir[i][1];
                
                if(y>=0 && y<n && x>=0 && x<m && box[y][x]==0)
                {
                    q.add(new int[]{y,x});
                    box[y][x] = day+1;
                }
                
                y -= dir[i][0];
                x -= dir[i][1];
            }
        }
        
        int result = Integer.MIN_VALUE;
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                // case 1 : 하나라도 0이 있을 때 => 익히지 못하는 토마토가 존재
                if(box[i][j]==0)
                {
                    return -1;
                }
                else if(box[i][j]>result) // 0이 없을 때에는 최소 날짜를 구하기 위해 최소값 대체
                {
                    result = box[i][j];
                }
            }
        }
        
        // case 2 : 0이 없고, 최대값이 1일 때 => 1과 -1만 존재하므로 이미 익은 상태
        if(result==1)
        {
            return 0;
        }
        // case 3 : 0이 없고, 최대값이 1이 아닐 때 => BFS 실행 최대값에 -1한 결과를 리턴
        else
        {
            return result-1;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] box = new int[n][m];
        Queue<int[]> q = new LinkedList<int[]>();
        
        // box에 값 초기값 설정
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                box[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                // 토마토 시작 위치를 전부 큐에 삽입
                if(box[i][j]==1)
                {
                    q.add(new int[]{i, j});
                }
            }
        }
        
        System.out.println(makeMature(q, box, n, m));
        sc.close();
    }
}

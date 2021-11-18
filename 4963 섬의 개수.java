https://yoloaeee.tistory.com/192

====================================
  
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main
{
    // 전후좌우, 대각선 4방향을 포함한 8방향 고려
    static int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1},{1,1},{1,-1},{-1,1},{-1,-1}};
    
    public static int makeIsland(int[][] map, boolean[][] visit, int[] start, int h, int w)
    {
        // BFS 실행
        Queue<int[]> q = new LinkedList<int[]>();
        q.add(start);
        
        while(!q.isEmpty())
        {
            int[] temp = q.poll();
            int y = temp[0];
            int x = temp[1];
            visit[y][x] = true;
            
            for(int i=0; i<dir.length; i++)
            {
                y += dir[i][0];
                x += dir[i][1];
                
                if(y>=0 && y<h && x>=0 && x<w && !visit[y][x] && map[y][x]==1)
                {
                    visit[y][x] = true;
                    q.add(new int[]{y,x});
                }
                
                y -= dir[i][0];
                x -= dir[i][1];
            }
        }
        
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        while(true)
        {
            String input = sc.nextLine();
            
            // 종료 조건
            if(input.equals("0 0"))
            {
                break;
            }
            
            // BFS 실행을 위한 배열 및 변수 기본설정
            String[] temp = input.split(" ");
            int w = Integer.parseInt(temp[0]);
            int h = Integer.parseInt(temp[1]);
            int cnt = 0;
            int[][] map = new int[h][w];
            boolean[][] visit = new boolean[h][w];
            
            for(int i=0; i<h; i++)
            {
                for(int j=0; j<w; j++)
                {
                    map[i][j] = sc.nextInt();
                }
            }
            for(int i=0; i<h; i++)
            {
                for(int j=0; j<w; j++)
                {
                    if(map[i][j]==1 && !visit[i][j])
                    {
                        cnt += makeIsland(map, visit, new int[]{i, j}, h, w);
                    }
                }
            }
            
            // 결과값에 테스트케이스별 cnt변수를 더해주기
            sb.append(cnt + "\n");
            // 버퍼를 비우기 위한 임시변수("\n") 처리
            String buffer = sc.nextLine();
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}

 

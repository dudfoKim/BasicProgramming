https://yoloaeee.tistory.com/189

===================================

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main
{
    // 시작 인덱스를 기준으로 BFS 실행
    public static int makeConnect(int[][] graph, boolean[] visit, int start, int n)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(start);
        visit[start] = true;
        
        while(!q.isEmpty())
        {
            int index = q.poll();
            
            for(int i=0; i<n; i++)
            {
                if(i!=start && !visit[i] && graph[index][i]==1)
                {
                    visit[i] = true;
                    q.add(i);
                }
            }
        }
        
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        int[][] graph = new int[n][n];
        boolean[] visit = new boolean[n];
        
        for(int i=0; i<m; i++)
        {
            int start = sc.nextInt()-1;
            int end = sc.nextInt()-1;
            
            // 양방향 그래프 생성
            graph[start][end] = 1;
            graph[end][start] = 1;
        }
        
        // makeConnect를 실행하는 횟수 = 연결 요소의 갯수
        for(int i=0; i<n; i++)
        {
            if(!visit[i])
            {
                cnt += makeConnect(graph, visit, i,n );
            }
        }
        
        System.out.println(cnt);
        sc.close();
    }
}

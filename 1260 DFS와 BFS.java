https://yoloaeee.tistory.com/132

==================================================

import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    // Queue를 사용한 bfs
    public static void bfs(int[][] graph, boolean[] visit, int start)
    {
        Queue<Integer> q = new LinkedList<Integer>();
        start--;
        visit[start] = true;
        q.add(start);
        
        while(!q.isEmpty())
        {
            start = q.peek();
            System.out.print((q.poll()+1) + " ");

            for(int i=0; i<graph[start].length; i++)
            {
                if(start!=i && graph[start][i]==1 && !visit[i])
                {
                    visit[i] = true;
                    q.add(i);
                }
            }
        }
    }
    // 재귀를 사용한 dfs
    public static void dfs(int[][] graph, boolean[] visit, int start)
    {
        start--;
        
        if(visit[start])
        {
            return;
        }
        
        visit[start] = true;
        System.out.print((start+1)+ " ");
        
        for(int i=0; i<graph[start].length; i++)
        {
            if(graph[start][i]==1 && !visit[i])
            {
                dfs(graph, visit, i+1);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();
        
        int[][] graph = new int[n][n];
        boolean[] visit = new boolean[n];
        
        for(int i=0; i<m; i++)
        {
            int start = sc.nextInt();
            int end = sc.nextInt();
            
            graph[start-1][end-1] = 1;
            graph[end-1][start-1] = 1;
        }
        
        dfs(graph, visit, v);
        System.out.println();
        Arrays.fill(visit, false);
        bfs(graph, visit, v);
    }
}

https://yoloaeee.tistory.com/176

=====================================

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main
{
    public static void makeWay(int[][] graph, int[][] way, boolean[] visit, int start, int n)
    {
        Stack<Integer> s = new Stack<Integer>();
        s.push(start);
        
        // dfs 실행
        while(!s.isEmpty())
        {
            int index = s.pop();
            
            for(int i=0; i<n; i++)
            {
                // 조건에 맞는 vertex일 경우 방문표시
                if(graph[index][i]==1 && !visit[i])
                {
                    way[start][i] = 1;
                    visit[i] = true;
                    s.push(i);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        // n개의 vertex 개수만큼 배열별로 설정
        int n = sc.nextInt();
        int[][] graph = new int[n][n];
        int[][] way = new int[n][n];
        boolean[] visit = new boolean[n];
        
        // vertex들끼리의 연결상태 설정
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                graph[i][j] = sc.nextInt();
            }
        }
        
        // n개만큼의 vertex별로 DFS를 이용해 방문여부를 탐색
        for(int i=0; i<n; i++)
        {
            Arrays.fill(visit, false);
            makeWay(graph, way, visit, i, n);
        }
        
        // 결과값 출력
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                sb.append(way[i][j] + " ");
            }
            
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}

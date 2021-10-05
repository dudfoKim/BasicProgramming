https://yoloaeee.tistory.com/127

====================================================

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main
{
    // 전역번수 : 스택, 결과값
    private static Stack<Integer> s = new Stack<Integer>();
    private static int cnt = 0;

    // dfs 실행
    public static void dfs(int[][] map, boolean[] visit, int start)
    {
        s.push(start);
        visit[start] = true;

        while(!s.isEmpty())
        {
            int first = s.pop();

            for(int i=1; i<map.length; i++)
            {
                if(map[first][i]==1 && !visit[i])
                {
                    // 새로운 인접 컴퓨터가 생길 때마다 +1한 후, 그 컴퓨터 인덱스로 다시 dfs실행
                    cnt++;
                    dfs(map, visit, i);
                }
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

    // 컴퓨터의 수
    int n = sc.nextInt();
    int[][] map = new int[n+1][n+1];
    boolean[] visit = new boolean[n+1];
    Arrays.fill(visit, false);

    // 컴퓨터끼리 이어진 개수
    int connect = sc.nextInt();

    for(int i=0; i<connect; i++)
    {
        int start = sc.nextInt();
        int end = sc.nextInt();
        map[start][end] = 1;
        map[end][start] = 1;
    }

    dfs(map, visit, 1);
    System.out.println(cnt);
    sc.close();
    }
}

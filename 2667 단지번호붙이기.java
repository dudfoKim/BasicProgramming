https://yoloaeee.tistory.com/128

=====================================================================================
  
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main
{
        static int danji_cnt = 0; // 총 단지 개수
        static ArrayList<Integer> house_cnt = new ArrayList<Integer>(); // 각 단지별 집의 개수

        public static void dfs(int[][] house, boolean[][] visit, Stack<int[]> s, int[][] dir, int x, int y, int max)
        {
                int temp = 0;
                danji_cnt++;
                s.push(new int[] {x,y});
                visit[x][y] = true;

                while(!s.isEmpty())
                {
                     temp++;
                     int nowX = s.peek()[0];
                     int nowY = s.peek()[1];
                     s.pop();

                     for(int i=0; i<dir.length; i++)
                     {
                          int nextX = nowX + dir[i][0];
                          int nextY = nowY + dir[i][1];

                          / 현재 위치에서 다음 위치로 이동하는 좌표가 N*N 행렬의 범위에 맞고 + 이미 체크한 집이 아니며 + 집이라고 명시되어 있을 때
                          if(nextX>=0 && nextX<max && nextY>=0 && nextY<max && !visit[nextX][nextY] && house[nextX][nextY]==1)
                          {
                               visit[nextX][nextY] = true;
                               s.push(new int[] {nextX, nextY});
                          }
                     }
                }

                house_cnt.add(temp);
        }
        public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
        
                // NxN 형태의 2차원 배열 및 Queue 설정
                int[][] house = new int[n][n];
                boolean[][] visit = new boolean[n][n];
                Stack<int[]> s = new Stack<int[]>();
        
                // 상하좌우 방향
                int[][] dir = new int[][] {{1,0},{0,1},{-1,0},{0,-1}};
        
                for(int i=0; i<n; i++)
                {
                     Arrays.fill(house[i], 0);
                     Arrays.fill(visit[i], false);
                }
        
                for(int i=0; i<n; i++)
                {
                     String temp = sc.next();
        
                     for(int j=0; j<temp.length(); j++)
                     {
                             house[i][j] = Integer.parseInt(temp.charAt(j) + "");
                     }
                }
        
                // 1로 값을 받아온 집을 기준으로 dfs 실행
                for(int i=0; i<n; i++)
                {
                     for(int j=0; j<n; j++)
                     {
                             // 이미 체크된 집은 제외
                             if(house[i][j]==1 && !visit[i][j])
                             {
                                     dfs(house, visit, s, dir, i, j, n);
                             }
                     }
                }
             
             // static변수로 설정된 단지의 개수와 ArrayList로 받아놓은 각 단지별 집의 개수를 정렬해수 출력
             System.out.println(danji_cnt);
             
             Collections.sort(house_cnt);
             
             for(int data : house_cnt)
             {
                     System.out.println(data);
             }
         }
     }

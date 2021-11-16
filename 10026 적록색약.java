https://yoloaeee.tistory.com/188

===================================

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main
{
    // 상하좌우 탐색을 위한 배열
    static int[][] direct = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
    
    // BFS 실행을 통한 그래프 탐색처리
    public static int makeDepart(char[][] pic, boolean[][] visit, int y, int x, int n, char color)
    {
        Queue<int[]> q = new LinkedList<int[]>();
        q.add(new int[]{y,x});
        visit[y][x] = true;
        
        while(!q.isEmpty())
        {
            int[] temp = q.poll();
            int nowY = temp[0];
            int nowX = temp[1];
            
            for(int i=0; i<direct.length; i++)
            {
                nowY += direct[i][0];
                nowX += direct[i][1];
                
                if(nowY>=0 && nowY<n && nowX>=0 && nowX<n && !visit[nowY][nowX] && pic[nowY][nowX]==color)
                {
                    visit[nowY][nowX] = true;
                    q.add(new int[]{nowY, nowX});
                }
                
                nowY -= direct[i][0];
                nowX -= direct[i][1];
            }
        }
        
        // 실행좌표를 기준으로 BFS가 끝나면 결과값 리턴
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 정상인 사람이 그림을 볼 때 변수
        char[][] pic = new char[n][n];
        char[][] notDepartPic = pic.clone();
        // 적록색약인 사람이 그림을 볼 때의 변수
        boolean[][] visit = new boolean[n][n];
        boolean[][] notDepartVisit = visit.clone();
        
        int canDepart = 0;
        int notDepart = 0;
        
        // 그림에 대한 입력값 처리
        for(int i=0; i<n; i++)
        {
            String temp = sc.next();
            
            for(int j=0; j<temp.length(); j++)
            {
                pic[i][j] = temp.charAt(j);
            }
        }
        // 정상인 사람이 그림을 볼 때의 영역구분
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(!visit[i][j])
                {
                    canDepart += makeDepart(pic, visit, i, j, n, pic[i][j]);
                }
            }
        }
        // 적록색약인 사람은 G와 R 구분을 못하기 때문에 전부 변경하고 방문 배열은 초기화
        for(int i=0; i<n; i++)
        {
            Arrays.fill(notDepartVisit[i], false);
            
            for(int j=0; j<n; j++)
            {
                if(notDepartPic[i][j]=='G')
                {
                    notDepartPic[i][j] ='R';
                }
            }
        }
        // 적록색약인 사람이 그림을 볼 때의 영역구분
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(!notDepartVisit[i][j])
                {
                    notDepart += makeDepart(notDepartPic, notDepartVisit, i, j, n, notDepartPic[i][j]);
                }
            }
        }
        
        System.out.println(canDepart + " " + notDepart);
        sc.close();
    }
}

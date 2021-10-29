https://yoloaeee.tistory.com/155

====================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[][] map = new int[100+1][100+1]; // 최대 좌표값 100
        int cnt = 0;
        
        // 차례대로 좌표설정
        for(int i=0; i<4; i++)
        {
            int startY = sc.nextInt();
            int startX = sc.nextInt();
            int endY = sc.nextInt();
            int endX = sc.nextInt();
            
            // 반복문을 통해 좌표 내의 값을 모두 1로 설정
            for(int m=startX; m<endX; m++)
            {
                for(int n=startY; n<endY; n++)
                {
                    map[m][n] = 1;
                }
            }
        }
        
        // 1의 개수 카운트
        for(int i=1; i<map.length; i++)
        {
            for(int j=1; j<map[0].length; j++)
            {
                if(map[i][j]==1)
                {
                    cnt++;
                }
            }
        }
        
        System.out.println(cnt);
        sc.close();
    }
}

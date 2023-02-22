https://yoloaeee.tistory.com/289

==================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int cnt = 0;
        int[][] map = new int[101][101];
        
        for(int i=0; i<t; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            for(int m=x; m<x+10; m++)
            {
                for(int n=y; n<y+10; n++)
                {
                    map[m][n] = 1;
                }
            }
        }
        for(int i=0; i<101; i++)
        {
            for(int j=0; j<101; j++)
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

https://yoloaeee.tistory.com/91?category=954228


====================================================================

import java.util.*;

public class Main 
{
     public static void main(String[] args) 
     {
         Scanner sc = new Scanner(System.in);
         int t = sc.nextInt();
        
         // 최대 배열 설정
         int x = 15;
         int y = 16;
         int[][] people = new int[16][16];
        
         // dp배열 초기값 설정(0층 i호에 사는 사람 : i명)
         for(int b=1; b<people[0].length; b++)
         {
              people[0][b] = b;
         }
        
         // dp배열 채우기(a층 b호에 사는 사람 : a-1층 b호 + a층 b-1호)
         for(int a=1; a<people.length; a++)
         {
              for(int b=1; b<people[0].length; b++)
              {
                   people[a][b] = people[a-1][b] + people[a][b-1];
              }
         }
        
         // 결과 출력
         for(int i=0; i<t; i++)
         {
              int a = sc.nextInt();
              int b = sc.nextInt();
            
              System.out.println(people[a][b]);
         }
     }
}

https://yoloaeee.tistory.com/158

====================================

import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
       public static void main(String[] args)
       {
            Scanner sc = new Scanner(System.in);
            StringBuilder sb = new StringBuilder();
            int t = sc.nextInt();

            for(int i=0; i<t; i++)
            {
                 int n = sc.nextInt();
                 int people = 0;

                 // 각 방에 대한 설정
                 boolean[] room = new boolean[n+1];
                 Arrays.fill(room, false);
            
                 // 1~n라운드까지 방의 인덱스를 기준으로 나눠질 때 현재값과 반대로 설정
                 for(int round=1; round<=n; round++)
                 {
                     for(int j=0; j<room.length; j++)
                     {
                          if(j%round==0)
                          {
                               room[j] = !room[j];
                          }
                     }
                 }

                 // 마지막 라운드 종료 후 열린 방의 개수를 결과값으로 출력
                 for(int j=1; j<room.length; j++)
                 {
                      if(room[j])
                     {
                          people++;
                     }
                 }
            
                 sb.append(people + "\n");
            }
        
        System.out.println(sb.toString());
        sc.close();
     }
}

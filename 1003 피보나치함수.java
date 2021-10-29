https://yoloaeee.tistory.com/156

====================================

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
        public static void main(String[] args) 
        {
                Scanner sc = new Scanner(System.in);
                StringBuilder sb = new StringBuilder();
        
                // f(0), f(1) 등 dp에 이용할 기초값 설정
                ArrayList<int[]> list = new ArrayList<int[]>();
                list.add(new int[]{1,0});
                list.add(new int[]{0,1});
        
                // n의 최대 값인 40까지 dp 실행
                for(int i=2; i<=40; i++)
                {
                    int zero = list.get(i-1)[0] + list.get(i-2)[0];
                    int one = list.get(i-1)[1] + list.get(i-2)[1];
                    list.add(new int[]{zero, one});
                }

                // 테스트케이스 갯수만큼 입력받는 인덱스에 대한 0, 1의 개수 출력
                int t = sc.nextInt();
        
                for(int i=0; i<t; i++)
                {
                        int index = sc.nextInt();
                       sb.append(list.get(index)[0] + " " + list.get(index)[1] + "\n");
                }
        
                System.out.print(sb.toString());
                sc.close();
        }        
}

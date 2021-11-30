https://yoloaeee.tistory.com/209

=======≈===========================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        // 테스트케이스 : 3 (고정)
        for(int i=0; i<3; i++)
        {
            int n = 0;
            
            // 윷의 개수 : 4 (고정)
            for(int j=0; j<4; j++)
            {
                if(sc.nextInt()==1)
                {
                    n++;
                }   
            }
            
            // 등이 4개 : 모
            if(n==4)
            {
                sb.append("E" + "\n");
            }
            // 등이 3개 : 도
            else if(n==3)
            {
                sb.append("A" + "\n");
            }
            // 등이 2개 : 개
            else if(n==2)
            {
                sb.append("B" + "\n");
            }
            // 등이 1개 : 걸
            else if(n==1)
            {
                sb.append("C" + "\n");
            }
            // 등이 0개 : 윷
            else
            {
                sb.append("D" + "\n");
            }
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}

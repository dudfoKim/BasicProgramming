https://yoloaeee.tistory.com/165

===================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        char[][] text = new char[5][15];
        
        // 가로 기준으로 전체 값 읽어오기
        for(int i=0; i<5; i++)
        {
            String temp = sc.nextLine();
            
            for(int j=0; j<temp.length(); j++)
            {
                text[i][j] = temp.charAt(j);
            }
        }
        
        // 세로 기준으로 값 조회 후, 조건 만족 시 결과값에 저장
        for(int i=0; i<15; i++)
        {
            for(int j=0; j<5; j++)
            {
                // 입력되지 않은 칸은 결과값에 제외
                if(text[j][i]!=0)
                {
                    sb.append(text[j][i]);
                }
            }
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}

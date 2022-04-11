https://yoloaeee.tistory.com/238


============================

import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // 기본 사용변수 초기화설정 및 입력값 처리
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        sb.append("<");
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 1;
        int index = 0;
        
        // 1~n까지 숫자 삽입
        for(int i=1; i<=n; i++)
        {
            list.add(i);
        }
        
        // 리스트가 빌 때까지 반복
        while(!list.isEmpty())
        {
            index = index%list.size();
            
            if(cnt==k)
            {
                sb.append(list.get(index) + ", ");
                list.remove(index);
                cnt = 1;
            }
            else
            {
                cnt++;
                index++;
            }
        }
        
        // 결과값 처리 후 출력
        System.out.println(sb.toString().substring(0, sb.length()-2) + ">");
        sc.close();
    }
}

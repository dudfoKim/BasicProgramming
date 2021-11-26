https://yoloaeee.tistory.com/206

===================================

import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // 1000개까지의 숫자를 담을 리스트
        ArrayList<Integer> list = new ArrayList<Integer>();
        int sum = 0;
        int loop = 1;
        int max = 1001;
        // 수열의 시작과 끝 범위를 설정
        int start = sc.nextInt();
        int end = sc.nextInt();
        
        // 리스트에 n을 n번 반복해서 넣기
        while(list.size()<=max)
        {
            for(int i=1; i<=loop; i++)
            {
                list.add(loop);
            }
            
            loop++;
        }
        
        // 리스트 범위에 따른 결과값 설정
        for(int i=start; i<=end; i++)
        {
            sum += list.get(i-1);
        }
        
        System.out.println(sum);
        sc.close();
    }
}

https://yoloaeee.tistory.com/168

==============================================


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Integer[] melody = new Integer[8];
        
        for(int i=0; i<8; i++)
        {
            melody[i] = sc.nextInt();
        }
        
        // 오름차순과 내림차순을 체크할 수 있는 배열, 변수를 각각 설정
        Integer[] isAsc = melody.clone();
        Integer[] isDesc = melody.clone();
        boolean chkAsc = true;
        boolean chkDesc = true;
        
        Arrays.sort(isAsc);
        Arrays.sort(isDesc, Collections.reverseOrder());
        
        // 오름차순 배열값과 다른 지 체크
        for(int i=0; i<melody.length; i++)
        {
            if(melody[i]!=isAsc[i])
            {
                chkAsc = false;
                break;
            }
        }
        // 내림차순 배열값과 다른 지 체크
        for(int i=0; i<melody.length; i++)
        {
            if(melody[i]!=isDesc[i])
            {
                chkDesc = false;
                break;
            }
        }
        
        // 체크결과 2개를 조합해 결과값 출력
        System.out.println(chkAsc?"ascending":chkDesc?"descending":"mixed");
        sc.close();
    }
}

https://yoloaeee.tistory.com/90

===========================================================================

import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int result = t; // 결과
        boolean[] chk = new boolean[26]; // 알파벳별 체크여부
        
        for(int i=0; i<t; i++)
        {
            String input = sc.next();
            
            // 문자열 길이가 1이면 묻지도 따지지도 않고 조건만족
            if(input.length()==1)
            {
                continue;
            }
            else
            {    
                // 조건체크 전 초기값 설정
                Arrays.fill(chk, false);
                char lastChar = '0';
            
                for(int j=0; j<input.length(); j++)
                {
                    // 문자열의 체크할 문자값 설정 
                    char now = input.charAt(j);
                    int index = now - 97;
                    
                    // 체크할 문자값(input.charAt(j))과 현재 문자값(lastChar) 비교
                    if(lastChar!=now)
                    {
                        // 다를 때는 무조건 현재 문자값을 업데이트
                        lastChar = now;
                        
                        // 문자값이 다르면서 이미 체크한 문자가 있으면 조건만족을 실패한 문자열
                        if(chk[index])
                        {
                            result--;
                            break;
                        }
                        // 이미 체크한 문자가 없으면 체크표시
                        else
                        {
                            chk[index] = true;
                        }
                    }
                }
            }
        }
        
        System.out.println(result);
    }
}

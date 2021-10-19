https://yoloaeee.tistory.com/m/146

====================================

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int[] num = new int[10];
        Arrays.fill(num, 0);
        
        for(int i=0; i<n.length(); i++)
        {
            int c = Integer.parseInt(n.charAt(i)+"");
            
            // 카운트 된 숫자는 아래 조건에 따라 다르게 처리
            if(num[c]!=0)
            {
                // 체크 숫자가 6일 때, 9를 사용한 개수가 6보다 적을 때는 9에 +1
                if(c==6 && num[6]>num[9])
                {
                    num[9]++;
                }
                // 체크 숫자가 9일 때, 6를 사용한 개수가 9보다 적을 때는 6에 +1
                else if(c==9 && num[9]>num[6])
                {
                    num[6]++;
                }
                // 그 외 경우는 해당 숫자에 +1
                else
                {
                    num[c]++;
                }
            }
            // 아직 카운트 안된 숫자는 무조건 +1
            else
            {
                num[c]++;
            }
        }
        
        // 최대 세트 수를 구하기 위해 정렬한 후 맨 마지막 값을 출력
        Arrays.sort(num);
        System.out.println(num[num.length-1]);
    }
}

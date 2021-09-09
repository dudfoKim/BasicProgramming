https://yoloaeee.tistory.com/m/93

≈====================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        int target = sc.nextInt();
        int step = 1; // 그룹
        boolean chk = true; // 방향
        
        // 입력받은 변수를 최대까지 빼주기
        while(target>step)
        {
            target -= step;
            step++;
            chk = !chk; // 그룹이 올라갈 때마다 방향 바꾸기
        }
        
        // 방향에 따라 분자 분모 바꿔서 출력
        if(chk)
        {
            System.out.println((step-(target-1)) + "/" + target);
        }
        else
        {
            System.out.println(target + "/" + (step-(target-1)));
        }
        
        sc.close();
    }
}


https://yoloaeee.tistory.com/94

=============================================================


import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long target = sc.nextLong();

        // 1일 경우 예외처리
        if(target==1)
        {
            System.out.println(1);
            return;
        }
        
        // 초기값 설정
        long step = 1;
        long n = 1;
        long boundary = n + (step*6);
        
        // 2부터 시작
        n++;
        
        while(n!=target)
        {
            // 같은 step일 경우, n만 증가
            if(n<boundary)
            {
                n++;
            }
            // n이 boundary에 있을 경우, step을 증가하고 boundary값 업데이트
            else
            {
                step++;
                boundary = n + (step*6);
            }
        }
        
        // 결과로 step+1을 출력
        System.out.println(step+1);
        sc.close();
    }
}

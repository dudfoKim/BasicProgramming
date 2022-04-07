https://yoloaeee.tistory.com/235

===================================
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // 입력값 처리 및 초기값 설정
        int k = sc.nextInt();
        int a[] = new int[45];
        int b[] = new int[45];
        a[0] = 0;
        b[0] = 1;
        
        // 점화식 실행
        for(int i=1; i<k; i++)
        {
            a[i] = b[i-1];
            b[i] = a[i-1] + b[i-1];
        }
        
        System.out.println(a[k-1] + " " + b[k-1]);
        sc.close();
    }
}

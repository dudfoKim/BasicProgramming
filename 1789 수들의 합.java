https://yoloaeee.tistory.com/258

=============================================
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        long cnt = 0;
        long sum = 0;
        
        while(sum<=s)
        {
            cnt++;
            sum += cnt;
        }
        
        System.out.println(cnt-1);
        sc.close();
    }
}

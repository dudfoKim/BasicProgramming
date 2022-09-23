https://yoloaeee.tistory.com/252


==========================================
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] cnt = new int[5];
        int n = sc.nextInt();
        String buf = sc.nextLine();
        
        for(int i=0; i<n; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            if(x==0 || y==0)
            {
                cnt[4]++;
            }
            else if(x>0)
            {
                if(y>0)
                {
                    cnt[0]++;
                }
                else
                {
                    cnt[3]++;
                }
            }
            else
            {
                if(y>0)
                {
                    cnt[1]++;
                }
                else
                {
                    cnt[2]++;
                }
            }
        }
        
        for(int i=0; i<5; i++)
        {
            if(i<4)
            {
                System.out.println("Q" + (i+1) + ": " + cnt[i]);
            }
            else
            {
                System.out.println("AXIS: " + cnt[4]);
            }
        }
        
        sc.close();
    }
}

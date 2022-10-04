https://yoloaeee.tistory.com/256


=========================================
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++)
        {
            int n = sc.nextInt();
            int cnt = 0;
            StringBuilder sb = new StringBuilder();
            
            while(n!=0)
            {
                if(n%2==1)
                {
                    sb.append(cnt + " ");
                }
                
                n /= 2;
                cnt++;
            }
            
            System.out.println(sb.toString().substring(0, sb.length()-1));
        }
        
        sc.close();
    }
}

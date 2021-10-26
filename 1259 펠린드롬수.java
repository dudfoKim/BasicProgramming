https://yoloaeee.tistory.com/153

=======================================
  
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        while(true)
        {
            String input = sc.next();
            boolean flag = true;
            
            // 0을 만나면 종료
            if(input.equals("0"))
            {
                break;
            }
            
            // 범위를 줄이면서 하나라도 조건이 불만족하면 false 리턴
            for(int i=0; i<=input.length()/2; i++)
            {
                if(input.charAt(i)!=input.charAt(input.length()-1-i))
                {
                    flag = false;
                    break;
                }
            }
            
            if(flag)
            {
                sb.append("yes");
            }
            else
            {
                sb.append("no");
            }
            
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}

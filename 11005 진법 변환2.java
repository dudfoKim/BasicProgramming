https://yoloaeee.tistory.com/243

=======================================
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        String[] input = sc.nextLine().split(" ");
        long num = Long.parseLong(input[0]);
        int jinsu = Integer.parseInt(input[1]);
        
        while(num!=0)
        {
         long temp = num%jinsu;
        
            // 10부터는 A형태로 표현해야하므로 아스키코드 활용
         if(temp>=10)
         {
         temp += 55;
             sb.append((char)temp);
         }
         else
         {
         sb.append(temp);
         }
        
         num /= jinsu;
        }
        
        System.out.println(sb.reverse().toString());
        sc.close();
    }
}

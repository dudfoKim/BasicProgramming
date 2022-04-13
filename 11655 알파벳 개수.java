https://yoloaeee.tistory.com/240

========================================
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<input.length(); i++)
        {
            char value = input.charAt(i);
            int temp = value;
            
            // 대문자일때
            if(value>=65 && value<=90)
            {
             temp += 13;
            
             if(temp>90)
             {
             temp = temp-90+64;
             }
            
             value = (char)temp;
            }
            // 소문자일때
            else if(value>=97 && value<=122)
            {
             temp += 13;
            
             if(temp>122)
             {
             temp = temp-122+96;
             }
            
             value = (char)temp;
            }
            
            // 그 외 경우는 그대로 출력
            sb.append(value);
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}

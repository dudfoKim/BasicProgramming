https://yoloaeee.tistory.com/232

=========================================================================

import java.util.Scanner;

public class Main
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         String input = sc.nextLine();
         StringBuilder sb = new StringBuilder();
         String result = "";

         for(int i=0; i<input.length(); i++)
         {
              char cmp = input.charAt(i);

              // 1. '>'를 만났을 때
              if(cmp=='>')
              {
                   if(sb.toString().contains("<"))
                   {
                        sb.append(cmp);
                        result += sb.toString();
                        sb.delete(0, sb.length());
                   }
             }
             // 2. '<'를 만났을 때
             else if(cmp=='<')
             {
                  // 2-1. 이미 '<'를 임시변수에 가지고 있을 때는 이전 값들을 거꾸로 결과값에 옮기기
                  if(sb.length()!=0)
                  {
                       result += sb.reverse().toString();
                       sb.delete(0, sb.length());
                       sb.append("<");
                  }
                  // 2-2. 그 외에는 그대로 결과값에 옮기기
                  else
                  {
                       sb.append(cmp);
                  }
             }
             // 3. ' '를 만났을 때
             else if(cmp==' ')
             {
                  if(sb.toString().contains("<"))
                  {
                       sb.append(cmp);
                  }
                  else
                  {
                       result += sb.reverse().toString() + " ";
                       sb.delete(0, sb.length());
                  }
             }
             // 4. 맨 마지막 인덱스인데 아직 값이 있을 때
             else if(i==input.length()-1 && sb.length()!=0) 
             {
                  sb.append(cmp);
                  result += sb.reverse().toString();
             }
             // 5.  그 외
             else
             {
                  sb.append(cmp);
             }
        }

        System.out.println(result);
        sc.close();
   }
}

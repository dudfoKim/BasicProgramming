https://yoloaeee.tistory.com/227

==========================================
  
import java.util.Scanner;

public class Main
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
        
         // 전처리
         String[] input = sc.nextLine().split(":");
         int a = Integer.parseInt(input[0]);
         int b = Integer.parseInt(input[1]);

         int first = Math.max(a, b);
         int second = Math.min(a, b);

         // 최대공약수 구하기
         while(second!=0)
         {
              int temp = first;
              first = second;
              second = temp%second;
         }

         System.out.println(a/first + ":" + b/first);
         sc.close();
     }
}

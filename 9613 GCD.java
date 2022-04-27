https://yoloaeee.tistory.com/246

==========================================
  
import java.util.Scanner;

public class Main
{
     // 최대공약수 구하기
     public static int gcd(int a, int b)
     {
         if(b==0)
         {
             return a;
         }
         else
         {
             return gcd(b, a%b);
         }
     }
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         StringBuilder sb = new StringBuilder();
         int t = sc.nextInt();
         String Buffer = sc.nextLine();
        
         for(int i=0; i<t; i++)
         {
              // 입력값 전처리
              String[] input = sc.nextLine().split(" ");
              int n = Integer.parseInt(input[0]);
              int[] arr = new int[n];
              long sum = 0;
        
              // gcd를 구할 수들을 배열에 저장
              for(int j=0; j<n; j++)
              {
                   arr[j] = Integer.parseInt(input[j+1]);
              }
              // 저장한 배열값들끼리의 gcd 결과처리 후 StringBuilder에 저장
              for(int j=0; j<n; j++)
              {
                   for(int k=j+1; k<n; k++)
                   {
                        sum += gcd(arr[j], arr[k]);
                   }
              }
        
              sb.append(sum + "\n");
         }
        
         System.out.println(sb.toString().substring(0, sb.length()-1));
         sc.close();
    }
}

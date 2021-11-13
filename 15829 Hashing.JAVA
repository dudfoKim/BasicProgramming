https://yoloaeee.tistory.com/184

========================================


import java.util.Scanner;

public class Main
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         int l = sc.nextInt();
         String input = sc.next();

         final long n = 31;
         final long mod = 1234567891;
         long pow = 1;
         long answer = 0; 

         for(int i=0; i<l; i++)
         {
              answer += (input.charAt(i) - 'a' + 1) * pow ;
              pow = (pow *= n) % mod;
         }

         System.out.println(answer%mod);
     }
}

https://yoloaeee.tistory.com/191

========================================
  
import java.util.Scanner;

public class Main
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         StringBuilder sb = new StringBuilder();
         int n = sc.nextInt();
         String line = sc.nextLine(); // \n를 제거하기 위한 입력 버퍼 설정

         for(int i=0; i<n; i++)
         {
              String temp = sc.nextLine();
              // 첫 번째 글자만 대문자로 바꾼 후 뒤의 substring은 갖다 붙이기
              String result = temp.substring(0, 1).toUpperCase() + "" + temp.substring(1, temp.length());
              sb.append(result + "\n");
         }

         System.out.print(sb.toString());
         sc.close();
     }
}

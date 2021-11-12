https://yoloaeee.tistory.com/182

============================================
  
  
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
         StringBuilder sb = new StringBuilder();
         int n = sc.nextInt();

         for(int i=0; i<n; i++)
         {
             int input = sc.nextInt();

             // case 1 : 0을 입력받았을 때
             if(input==0)
             {
                  // case 1-1 : 우선순위 큐가 비어있으면 0을 출력
                  if(pq.isEmpty())
                  {
                       sb.append(0 + "\n");
                  }
                  // case 1-2 : 우선순위 큐가 비어있지 않으면 최소 값을 출력
                  else
                  {
                       sb.append(pq.poll() + "\n");
                  }
             }
            // case 2 : 0이 아닌 값을 입력받았을 때는 우선순위 큐에 삽입
             else
             {
                  pq.add(input);
             }
         }

         System.out.println(sb.toString());
         sc.close();
     }
}

https://yoloaeee.tistory.com/183

=============================================
  
import java.util.LinkedList;
import java.util.Scanner;

public class Main
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in);
         LinkedList<Integer> q = new LinkedList<Integer>();
         StringBuilder sb = new StringBuilder();

         int n = sc.nextInt();

         for(int i=0; i<n; i++)
         {
             String input = sc.next();

             // 입력받는 명령어에 따라 구현
             if(input.equals("front"))
             {
                 sb.append(q.peekFirst()==null?-1:q.peekFirst());
                 sb.append("\n");
             }
             else if(input.equals("back"))
             {
                 sb.append(q.peekLast()==null?-1:q.peekLast());
                 sb.append("\n");
             }
             else if(input.equals("empty"))
             {
                 sb.append(q.isEmpty()==true?1:0);
                 sb.append("\n");
             }
             else if(input.equals("size"))
             {
                 sb.append(q.size());
                 sb.append("\n");
             }
             else if(input.equals("pop"))
             {
                 sb.append(q.peek()==null?-1:q.poll());
                 sb.append("\n");
             }
             else // queue에 push할 경우에는 출력 X
             {
                 String temp = sc.next();
                 q.add(Integer.parseInt(temp + ""));
             }
         }

         System.out.print(sb.toString());
         sc.close();
     }
}

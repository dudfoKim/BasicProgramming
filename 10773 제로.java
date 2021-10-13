https://yoloaeee.tistory.com/140

=================================================================
  

import java.util.Scanner;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       Stack<Integer> s = new Stack<Integer>();
    
       int k = sc.nextInt();
       int sum = 0;
    
       for(int i=0; i<k; i++)
       {
          int temp = sc.nextInt();
    
          if(temp==0) // 0일 때만 스택에서 pop
          {
              s.pop();
          }
          else // 나머지는 무조건 스택에 push
          {
              s.push(temp);
          }
     }
    
     while(!s.isEmpty())
     {
        sum += s.pop();
     }
    
       System.out.println(sum);
    }
}

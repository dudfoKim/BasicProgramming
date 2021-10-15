https://yoloaeee.tistory.com/144

=================================================================================

import java.util.Scanner;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            String input = sc.nextLine();
            
            // '.' 이 입력되면 바로 종료
            if(input.equals("."))
            {
             break;
            }
            else
            {
                Stack<Character> s = new Stack<Character>();
                boolean flag = true;

                for(int i=0; i<input.length(); i++)
                {
                    char temp = input.charAt(i);
                
                    // '('와 '['는 스택에 바로 push
                    if(temp=='(' || temp=='[')
                    {
                        s.push(temp);
                    }
                    // 현재 문자가 ')' 일때, 스택의 top이 '(' 이면 pop
                    else if(temp==')')
                    {
                        if(!s.isEmpty() && s.peek()=='(')
                        {
                            s.pop();
                        }
                        else
                        {
                            flag = false;
                            break;
                        }
                    }
                    // 현재 문자가 ']' 일때, 스택의 top이 '[' 이면 pop
                    else if(temp==']')
                    {
                        if(!s.isEmpty() && s.peek()=='[')
                        {
                            s.pop();
                        }
                        else
                        {
                            flag = false;
                            break;
                        }
                    }
                }
            
                // 스택의 모든 괄호가 pop 되었고, 중간에 조건을 전부 만족할 경우
                if(flag && s.isEmpty())
                {
                    System.out.println("yes");
                }
                // 스택에 괄호가 남아있거나 중간 조건을 하나라도 불만족하는 경우
                else
                {
                    System.out.println("no");
                }
            }
        }
        
        sc.close();
    }
}

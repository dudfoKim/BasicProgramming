https://yoloaeee.tistory.com/145

=====================================

import java.util.Scanner;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        // 기본 객체 및 변수 설정
        Scanner sc = new Scanner(System.in);
        Stack<Integer> s = new Stack<Integer>();
        StringBuilder sb = new StringBuilder();
        int max = sc.nextInt();
        int[] arr = new int[max];
        int index = 0;
        int push = 1;
        
        // 수열값 설정
        for(int i=0; i<max; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        while(push<=max+1 && index<max)
        {
            // 스택이 비었을 때는 무조건 push하고 '+' 를 저장
            if(s.isEmpty())
            {
                s.push(push);
                sb.append("+");
                sb.append("\n");
                push++;
            }
            // 스택의 top과 수열의 값이 달랐을 때도 push하고 '+' 를 저장
            if(s.peek()!=arr[index])
            {
                s.push(push);
                sb.append("+");
                sb.append("\n");
                push++;
            }
            // 같으면 pop하고 '-' 를 저장
            else
            {
                s.pop();
                sb.append("-");
                sb.append("\n");
                index++;
            }
        }
        
        // 맨 마지막 \n 문자를 제외하고 출력
        if(s.isEmpty())
        {
            System.out.println(sb.toString().substring(0, sb.length()-1));
        }
        else
        {
            System.out.println("NO");
        }
    }
}

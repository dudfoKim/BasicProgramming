https://yoloaeee.tistory.com/200

==================================

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    // 순서가 있고 중복이 안되는 순열 만들기
    public static void makeLotto(StringBuilder sb, ArrayList<Integer> temp, int start, int[] s, boolean[] visit, int target)
    {
        if(temp.size()==target)
        {
            for(int i=0; i<temp.size(); i++)
            {
                sb.append(temp.get(i) + " ");
            }
            
            sb.append("\n");
            return;
        }
        
        for(int i=start; i<s.length; i++)
        {
            if(!visit[i])
            {
                visit[i] = true;
                temp.add(s[i]);
                makeLotto(sb, temp, i, s, visit, target);
                temp.remove(temp.size()-1);
                visit[i] = false;
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        while(true)
        {
            StringBuilder sb = new StringBuilder();
            String t = sc.nextLine();
            
            // 테스트케이스 종료조건
            if(t.equals("0"))
            {
                break;
            }
            
            String[] value = t.split(" ");
            // 순열을 만들 값 설정
            int k = Integer.parseInt(value[0]);
            int[] s = new int[k];
            boolean[] visit = new boolean[k];
            // 순열은 무조건 6개로 고정
            int target = 6;
            ArrayList<Integer> temp = new ArrayList<Integer>();
            
            for(int i=1; i<value.length; i++)
            {
                s[i-1] = Integer.parseInt(value[i]);
            }
            
            makeLotto(sb, temp, 0, s, visit, target);
            System.out.println(sb.toString());
        }
        
        sc.close();
    }
}

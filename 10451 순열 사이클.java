https://yoloaeee.tistory.com/219

===================================================
  
  import java.util.Scanner;
import java.util.Arrays;
import java.util.Stack;

public class Main
{
    // 미니 dfs 실행
    public static void dfs(int[] arr, boolean[] visit, int start)
    {
        Stack<Integer> s = new Stack<Integer>();
        int cnt = 0;
        s.add(start);
        
        while(!s.isEmpty())
        {
            int index = s.pop();
            
            if(!visit[index])
            {
                visit[index] = true;
                s.add(arr[index]);
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int cnt = 0;
            boolean[] visit = new boolean[n];
            
            for(int j=0; j<n; j++)
            {
                arr[j] = sc.nextInt()-1;
            }
            
            Arrays.fill(visit, false);
            
            for(int j=0; j<n; j++)
            {
                if(!visit[j])
                {
                    dfs(arr, visit, j);
                    cnt++; // dfs 실행만큼 +1
                    visit[j] = true;
                }
            }
            
            System.out.println(cnt);
        }
        
        sc.close();
    }
}

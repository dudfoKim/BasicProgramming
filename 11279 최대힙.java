https://yoloaeee.tistory.com/161

===================================

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n =sc.nextInt();
        
        // 우선순위 큐 설정(Comparator을 활용한 내림차순 설정)
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(n, new Comparator<Integer>(){
           @Override
            public int compare(Integer x, Integer y)
            {
                return y-x;
            }
        });
        
        for(int i=0; i<n; i++)
        {
            int input = sc.nextInt();
            
            // 0을 입력받을 때 큐가 비었으면 0, 안 비었으면 최대값 출력
            if(input==0)
            {
                if(pq.isEmpty())
                {
                    sb.append(0 + "\n");
                }
                else
                {
                    sb.append(pq.poll() + "\n");
                }  
            }
            // 0이 아닌 값은 무조건 큐에 삽입
            else
            {
                pq.add(input);
            }
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}


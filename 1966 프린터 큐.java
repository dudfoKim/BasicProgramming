https://yoloaeee.tistory.com/185

=======================≈=========

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++)
        {
            int n = sc.nextInt();
            int index = sc.nextInt();
            int cnt = 0;
            
            ArrayList<int[]> docs = new ArrayList<int[]>();
            ArrayList<Integer> priority = new ArrayList<Integer>();
            
            for(int j=0; j<n; j++)
            {
                int temp = sc.nextInt();
                docs.add(new int[]{j, temp}); // 문서의 인덱스와 중요도를 함께 저장
                priority.add(temp); // 문서 중요도만 ArrayList에 저장
            }
            
            // case 1 : 문서 개수가 1일때는 무조건 결과값으로 1출력
            if(n==1)
            {
                sb.append(1 + "\n");
            }
            // case 2 : 문서 개수가 1이 아닐때는 아래 step에서 처리
            else
            {
                // case 2-1 : 문서 중요도를 내림차순으로 정렬
                Collections.sort(priority, Collections.reverseOrder());

                while(true)
                {
                    // case 2-2 : 문서 대기열 맨 앞의 중요도와 체크할 중요도가 같을 때
                    if(priority.get(0)==docs.get(0)[1])
                    {
                        cnt++;
                        
                        // case 2-2-1 : 중요도도 같고, 문서 인덱스도 같을 때(종료 조건)
                        if(index==docs.get(0)[0])
                        {
                            sb.append(cnt + "\n");
                            break;
                        }
                        // case 2-2-1 : 중요도는 같지만, 문서 인덱스가 다르면 대기열에서 제거
                        else
                        {
                            docs.remove(0);
                            priority.remove(0);
                        }
                    }
                    // case 2-3 : a
                    else
                    {
                        docs.add(docs.remove(0));
                    }
                }
            }
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}

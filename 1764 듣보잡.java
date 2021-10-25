https://yoloaeee.tistory.com/151

================================

import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>(); // 듣도 못한 사람 저장
        ArrayList<String> list = new ArrayList<String>(); // 듣도 + 보도 못한 사람 저장
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        
        for(int i=0; i<n; i++)
        {
            set.add(sc.next()); // 듣도 못한 사람을 전부 저장 후
        }
        
        for(int i=0; i<m; i++)
        {
            String temp = sc.next(); // 입력 받는 값(보도 못한 사람)과 비교해서
            
            if(set.contains(temp)) // 듣도 + 보도 못한 사람일 경우 list에 저장하고, cnt+1
            {
                cnt++;
                list.add(temp);
            }
        }
        
        Collections.sort(list); // 듣도 보도 못한 사람의 이름을 정렬해서 출력
        
        System.out.println(cnt);
        
        for(String s : list)
        {
            System.out.println(s);
        }
        
        sc.close();
    }
}

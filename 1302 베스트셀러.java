https://yoloaeee.tistory.com/152

===============================

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        // 책 이름을 기준으로 이미 map에 입력되었을 경우 +1, 없을 경우 1로 put
        for(int i=0; i<n; i++)
        {
            String temp = sc.next();
            
            if(map.containsKey(temp))
            {
                map.put(temp, map.get(temp)+1);
            }
            else
            {
                map.put(temp, 1);
            }
        }
        
        ArrayList<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());
        
        // 각 도서별로 count를 기준으로 정렬하며, count가 같으면 책 이름을 기준으로 정렬
        Collections.sort(list, new Comparator<Entry<String, Integer>>(){
           @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2)
            {
                if(o1.getValue()==o2.getValue())
                {
                    return o2.getKey().compareTo(o1.getKey());
                }
                else
                {
                    return o1.getValue()-o2.getValue();
                }
            }
        });
        
        System.out.println(list.get(list.size()-1).getKey());
    }
}

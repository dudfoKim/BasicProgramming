https://yoloaeee.tistory.com/237

=============================

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String buf = sc.nextLine();
        // TreeMap을 이용한 key 값 기준 자동정렬
        TreeMap<String, Integer> map = new TreeMap<String, Integer>();
        
        for(int i=0; i<n; i++)
        {
            String temp = sc.nextLine();
            temp = temp.substring(temp.indexOf(".")+1);
            
            if(map.containsKey(temp))
            {
                map.put(temp, map.get(temp)+1);
            }
            else
            {
                map.put(temp, 1);
            }
        }
        
        // Map의 값을 차례대로 빼주면서 결과값 출력
        while(!map.isEmpty())
        {
            Entry<String, Integer> temp = map.pollFirstEntry();
            System.out.println(temp.getKey() + " " + temp.getValue());
        }
                
        sc.close();
    }
}

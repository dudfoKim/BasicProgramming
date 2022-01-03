https://yoloaeee.tistory.com/214

----------------------------------------

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // 1. 기본 변수 설정
        HashMap<String, String> map = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String buf = "";
        int n = sc.nextInt(); // 그룹의 수
        int m = sc.nextInt(); // 문제의 수
        
        for(int i=0; i<n; i++)
        {
            String group = sc.next();
            String value = "";
            int member = sc.nextInt();
            buf = sc.nextLine();
            
            // 2. HashMap에 데이터를 저장
            // key : 그룹명, value : 멤버이름
            for(int j=0; j<member; j++)
            {
                String name = sc.nextLine();
                value += name + " ";
            }
            
            map.put(group, value);
        }
        
        for(int i=0; i<m; i++)
        {
            // 3. 문제로 입력받은 값 (멤버 이름/그룹명 둘 다 가능)
            String input = sc.nextLine();
            // 4. 문제로 입력받은 퀴즈종류 (0 : 그룹 내 멤버 정렬해서 출력 / 1 : 멤버가 속한 그룹명 출력 )
            int flag = sc.nextInt();
            buf = sc.nextLine();
            String key = "";
            String value = "";
            
            // 5. HashMap에 저장된 Set을 통째로 List형태로 변환해서 가져오기
            List<Entry<String, String>> list = new ArrayList<Entry<String, String>>(map.entrySet());
            
            // 6-1. 퀴즈종류가 1일 때 => 입력으로 받은 멤버가 속한 그룹명 출력
            if(flag==1)
            {
                for(int j=0; j<list.size(); j++)
                {
                    if(list.get(j).getValue().contains(input))
                    {
                        key = list.get(j).getKey();
                        break;
                    }
                }
                
                sb.append(key);
                sb.append("\n");
            }
            // 6-2. 퀴즈종류가 0일 때 => 입력으로 받은 그룹에 속한 멤버들의 이름을 정렬해서 출력
            else
            {
                String temp = map.get(input);
                String[] result = temp.split(" ");
                Arrays.sort(result);
                
                for(String r : result)
                {
                    sb.append(r);
                    sb.append("\n");
                }
            }
        }
        
        System.out.println(sb.substring(0, sb.length()-1));
        sc.close();
    }
}

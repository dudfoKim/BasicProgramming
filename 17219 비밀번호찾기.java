https://yoloaeee.tistory.com/174

=================================

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> map = new HashMap<String, String>();
        
        // n과 m 값 설정
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int m = Integer.parseInt(temp[1]);
        
        // n개의 사이트와 비밀번호를 map 형태의 key-value쌍으로 값 받아오기
        for(int i=0; i<n; i++)
        {
            temp = br.readLine().split(" ");
            map.put(temp[0], temp[1]);
        }
        
        // m개의 사이트에 대한 비밀번호를 map에서 꺼내오기
        for(int i=0; i<m; i++)
        {
            String site = br.readLine();
            
            if(map.containsKey(site))
            {
                sb.append(map.get(site) + "\n");
            }
        }
        
        System.out.println(sb.toString());
        br.close();
    }
}

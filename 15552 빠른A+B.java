https://yoloaeee.tistory.com/109

========================================================================

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main
{
    public static void main(String[] args) throws Exception
    {
        // BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        // StringTokenizer 객체 선언
        StringTokenizer st = null;
        st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        
        // StringBuilder 선언
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<t; i++)
        {
         st = new StringTokenizer(br.readLine());
         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());
         sb.append(a+b);
            sb.append("\n");
        }
        
        System.out.println(sb);
        br.close();
    }
}
 

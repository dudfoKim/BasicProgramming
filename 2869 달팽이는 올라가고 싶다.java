https://yoloaeee.tistory.com/95

===============================================
  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
    public static void main(String[] args) throws IOException
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     StringTokenizer st = new StringTokenizer(br.readLine(), " " );

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long v = Long.parseLong(st.nextToken());
        
        long day = a-b; // 24시간을 지나고 이동한 거리
        v -= a; // 도달만하면 종료하므로 미리 뺴주기
        
        // 나머지가 남는다는 건 하루를 더 가야하기 때문에 +2, 아니면 +1
        if(v%day!=0)
        {
            System.out.println(v/day+2);
        }
        else
        {
            System.out.println(v/day+1);
        }
    }
}

https://yoloaeee.tistory.com/126

==============================================================================
  
 
  import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<String>();
        
        // 입력받은 값들을 list에 저장
        for(int i=0; i<n; i++)
        {
         list.add(sc.next());
        }
        
        Collections.sort(list, new Comparator<String>() {
         @Override
         public int compare(String x, String y)
         {
                // 우선순위 1 : 길이에 따른 오름차순 정렬
                if(x.length()!=y.length())
                {
                     return x.length()>y.length()?1:-1;
                }
                // 우선순위 2 : 길이가 같을 때, 문자열 비교에 따른 오름차순 정렬
                else
                {
                     return x.compareTo(y);
                }
         }
        });
        
        String before = "";
        
        for(String d : list)
        {
            // 이전 문자열과 다를 때에만 출력
         if(!before.equals(d)) 
         {
         System.out.println(d);
         before = d;
         }
        }
        
        sc.close();
    }
}

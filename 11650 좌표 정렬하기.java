https://yoloaeee.tistory.com/125

======================================================
  
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] jwapyo = new int[n][2];
        
        // n개만큼 입력받은 후 jwapyo[0], jwapyo[1]에 각각 x, y좌표를 저장
        for(int i=0; i<n; i++)
        {
            jwapyo[i][0] = sc.nextInt();
            jwapyo[i][1] = sc.nextInt();
        }
                
        Arrays.sort(jwapyo, new Comparator<int[]>()
        {
             @Override
             public int compare(int[] o1, int[] o2)
             {
                  // x좌표가 다를 때에는 오름차순 정렬(우선순위)
                  if(o1[0]!=o2[0])
                  {
                       return o1[0]>o2[0]?1:-1;
                  }
                  // x좌표가 같을 때에는 y좌표를 기준으로 오름차순 정렬
                  else
                  {
                       return o1[1]>o2[1]?1:-1; 
                  }
             }
        });
        
        for(int i=0; i<jwapyo.length; i++)
        {
         System.out.println(jwapyo[i][0] + " " + jwapyo[i][1]);
        }
        
        sc.close();
    }
}

https://yoloaeee.tistory.com/112

=====================================================================
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	int[][] arr = new int[t][4];
    	
        // 선수번호 및 몸무게, 키 초기 설정
    	for(int i=0; i<t; i++)
    	{
    		arr[i][0] = i+1;
    		arr[i][1] = sc.nextInt();
    		arr[i][2] = sc.nextInt();
    	}
    	
    	for(int i=0; i<t; i++)
    	{
            // 비교대상 선수에 대한 몸무게와 키를 기준으로
    		int weight = arr[i][1];
    		int height = arr[i][2];
    		
            // 내 인덱스와 다를 경우, 몸무게/키가 전부 클 때만 체크
    		for(int j=0; j<t; j++)
    		{
    			if(i!=j)
    			{
    				if(weight<arr[j][1] && height<arr[j][2])
    				{
    					arr[i][3]++;
    				}
    			}
    		}
    	}
        
        // 모든 경우에 +1해서 순위를 출력
    	for(int i=0; i<t; i++)
    	{
    		System.out.print((arr[i][3]+1) + " ");
    	}
    }
}

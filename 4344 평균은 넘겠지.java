https://yoloaeee.tistory.com/100?category=954228

============================================

import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        // 테스트케이스 개수 t만큼 반복
        for(int i=0; i<t; i++)
        {
        	int n = sc.nextInt();
        	float[] arr = new float[n]; // 개수 비교를 위한 배열
        	float sum = 0; // 평균 계산
            int cnt = 0; // 평균보다 넘는 점수를 가진 학생 수
        	
        	for(int j=0; j<n; j++)
        	{
        		arr[j] = sc.nextFloat();
        		sum += arr[j];
        	}
        	
            for(float data : arr)
        	{
        		if(data>sum/n)
        		{
        			cnt++;
        		}
        	}
        	
          // String.format 메소드를 이용해 소수점 3자리로 설정
        	System.out.println(String.format("%.3f", (cnt*100)/(float)n) + "%");
        }
	}
}

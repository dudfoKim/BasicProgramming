https://yoloaeee.tistory.com/99

======================================================
  
import java.util.*;

public class Main 
{
    public static int makeSum(int n)
    {
        String temp = n + "";
        
        // n이 한 자리일 경우 앞에 0을 붙이기
        if(n<10)
        {
            temp = "0" + n;
        }
        
        String result = temp.charAt(1) + "";
        
        // 두 번째 숫자 구하기
        int second = Integer.parseInt(temp.charAt(0) + "") + Integer.parseInt(temp.charAt(1) + "");
        
        // 만약 10보다 크면 뒷자리만(두 숫자의 최대 합 : 18)
        if(second>=10)
        {
            second -= 10;
        }
        
        result += second + "";
        
        return Integer.parseInt(result);
  }
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = makeSum(n);
        int cnt = 1;
        
        // 입력이 0이어도 while문 안타고 바로 cnt 출력(예외처리 가능)
        while(n!=sum)
        {
            sum = makeSum(sum);
            cnt++;
        }
        
        System.out.println(cnt);
        sc.close();
	}
}

https://yoloaeee.tistory.com/337

==========================================
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[2];
        char[] input = sc.nextLine().toCharArray();
        int zero = 0;
        int one = 0;
        int cnt = 0;
        
        for(int i=0; i<input.length; i++)
        {
            if(input[i]=='0')
            {
            	zero++;
            }
            else if(input[i]=='1')
            {
            	one++;
            }
        }
        
        zero /= 2;
        one /= 2;
        
        for(int i=0; i<input.length; i++)
        {
        	if(cnt==one)
        	{
        		break;
        	}
        	if(input[i]=='1')
        	{
        		input[i] = '\0';
        		cnt++;
        	}
        }
        
        cnt = 0;
        
        for(int i=input.length-1; i>=0; i--)
        {
        	if(cnt==zero)
        	{
        		break;
        	}
        	if(input[i]=='0')
        	{
        		input[i] = '\0';
        		cnt++;
        	}
        }
        
        for(int i=0; i<input.length; i++)
        {
        	if(input[i]!='\0')
        	{
        		System.out.print(input[i]);
        	}
        }
        
        sc.close();
        return;
    }
}

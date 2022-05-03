https://yoloaeee.tistory.com/248

======================================================

import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char[][] chess = new char[8][8];
        int cnt = 0;
        
        // 입출력 처리
        for(int i=0; i<8; i++)
        {
        	String input = sc.nextLine();
        	
        	for(int j=0; j<8; j++)
        	{
        		chess[i][j] = input.charAt(j); 
        	}
        }
        
        for(int i=0; i<8; i++)
        {
            // 짝수 행일때(0부터 시작)
        	if(i%2==0)
        	{
        		for(int j=0; j<8; j=j+2)
        		{
        			if(chess[i][j]=='F')
        			{
        				cnt++;
        			}
        		}
        	}
            // 홀수 행일때
        	else
        	{
        		for(int j=1; j<8; j=j+2)
        		{
        			if(chess[i][j]=='F')
        			{
        				cnt++;
        			}
        		}
        	}
        }
        
        System.out.println(cnt);
        sc.close();
    }
}

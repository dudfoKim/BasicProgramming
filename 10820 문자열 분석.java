https://yoloaeee.tistory.com/189

===================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        
        while(sc.hasNextLine())
        {
            String input = sc.nextLine();
            
            int low = 0;
            int capital = 0;
            int num = 0;
            int space = 0;
            
            for(int i=0; i<input.length(); i++)
            {
                char value = input.charAt(i);
                
                if(value==32) // 스페이스
                {
                    space++;
                }
                else if(value>=48 && value<=57) // 숫자
                {
                    num++;
                }
                else if(value>=65 && value<=90) // 대문자
                {
                    capital++;
                }
                else if(value>=97 && value<=122) // 소문자
                {
                    low++;
                }
            }
            
            //System.out.println(low + " " + capital + " " + num + " " + space);
            sb.append(low + " " + capital + " " + num + " " + space + "\n");
        }
        
        System.out.print(sb.toString());
        sc.close();
    }
}

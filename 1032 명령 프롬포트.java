https://yoloaeee.tistory.com/167

============================================
  
import java.util.Scanner;

public class Main
{
    // 전역 변수 설정
    static char[] text;
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // n==1일때는 무조건 입력받은 값을 전체 출력
        if(n==1)
        {
            System.out.println(sc.next());
            return;
        }
        
        // 이외의 경우에는 n만큼 확인
        for(int i=0; i<n; i++)
        {
            String temp = sc.next();
            
            // text 배열에 대한 길이 및 초기값 설정
            if(i==0)
            {
                text = new char[temp.length()];
                
                for(int j=0; j<temp.length(); j++)
                {
                    text[j] = temp.charAt(j);
                }
            }
            else
            {
                // ?로 설정되어 있지 않지만 이전 입력값과 다를 경우 ?로 변경
                for(int j=0; j<temp.length(); j++)
                {
                    if(text[j]!='?' && text[j]!=temp.charAt(j))
                    {
                        text[j] = '?';
                    }
                }
            }
        }
        
        for(char c : text)
        {
            System.out.print(c);
        }
        
        sc.close();
    }
}

https://yoloaeee.tistory.com/254

======================================================
  
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int sum = 0;

        for(int i=0; i<input.length(); i++)
        {
            if(input.charAt(i)>=97)
            {
                sum += (input.charAt(i)-'a')+1;
            }
            else
            {
                sum += (input.charAt(i)-'A')+27;
            }
        }
        
        if(sum==1)
        {
            System.out.println("It is a prime word.");
            return;
        }
        for(int i=2; i*i<=sum; i++)
        {
            if(sum%i==0)
            {
                System.out.println("It is not a prime word.");
                return;
            }
        }
        
        System.out.println("It is a prime word.");
        sc.close();
    }
}

https://yoloaeee.tistory.com/242

===========================================
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = "";
        String b = "";
        
        for(int i=0; i<2; i++)
        {
         a += sc.next();
        }
        for(int i=0; i<2; i++)
        {
         b += sc.next();
        }

        System.out.println((Long.parseLong(a) + Long.parseLong(b)));
        sc.close();
    }
}

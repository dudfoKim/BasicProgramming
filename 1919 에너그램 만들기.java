https://yoloaeee.tistory.com/259

===========================================
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int[] arr = new int['z'-'a'+1];
        int[] brr = new int['z'-'a'+1];
        int len = 0;
        
        for(int i=0; i<a.length(); i++)
        {
            arr[a.charAt(i)-'a']++;
        }
        for(int i=0; i<b.length(); i++)
        {
            brr[b.charAt(i)-'a']++;
        }
        for(int i=0; i<arr.length; i++)
        {
            len += Math.abs(arr[i]-brr[i]);
        }
                            
        System.out.println(len);
        sc.close();
    }
}

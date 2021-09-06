https://yoloaeee.tistory.com/m/85

===≈=========================


import java.util.Scanner;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toUpperCase();
        int[] cnt = new int[26];
        int max = -1;
        int index = -1;
        
        for(int i=0; i<input.length(); i++)
        {
            cnt[input.charAt(i)-65]++;
        }
        
        for(int i=0; i<cnt.length; i++)
        {
            if(cnt[i]>max)
            {
                max = cnt[i];
                index = i;
            }
        }
        
        Arrays.sort(cnt);
        
        for(int i=cnt.length-2; i>=0; i--)
        {
            if(cnt[cnt.length-1]==cnt[i])
            {
                System.out.println("?");
                return;
            }
        }
        
        System.out.println((char)(index+65));
    }
}

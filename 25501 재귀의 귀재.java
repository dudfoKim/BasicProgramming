https://yoloaeee.tistory.com/251?category=954228

=========================================
    
import java.util.Scanner;

public class Main
{
    public static int[] recursion(String s, int left, int right, int cnt)
    {
        if(left>=right)
        {
            return new int[]{1, cnt};
        }
        else if(s.charAt(left)!=s.charAt(right))
        {
            return new int[]{0, cnt};
        }
        else
        {
            return recursion(s, left+1, right-1, cnt+1);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] result = new int[2];
        String buffer = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<t; i++)
        {
            String input = sc.nextLine();
            result = recursion(input, 0, input.length()-1, 1);
            
            for(int d : result)
            {
                sb.append(d + " ");
            }
            
            sb.append("\n");
        }
        
        System.out.println(sb.substring(0, sb.length()-1).toString());
        sc.close();
    }
}

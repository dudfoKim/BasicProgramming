https://yoloaeee.tistory.com/293

======================================
  
import java.util.HashSet;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
        StringBuilder sb = new StringBuilder();
        int m = sc.nextInt();
        String temp = sc.nextLine();
        
        for(int i=0; i<m; i++)
        {
            String[] input = sc.nextLine().split(" ");
            
            if(input[0].equals("add"))
            {
                set.add(input[1] + "");
            }
            else if(input[0].equals("remove"))
            {
                if(set.contains(input[1]))
                {
                    set.remove(input[1]);
                }
            }
            else if(input[0].equals("check"))
            {
                if(set.contains(input[1]))
                {
                    sb.append("1" + "\n");
                }
                else
                {
                    sb.append("0" + "\n");
                }
            }
            else if(input[0].equals("toggle"))
            {
                if(set.contains(input[1]))
                {
                    set.remove(input[1]);
                }
                else
                {
                    set.add(input[1]);
                }
            }
            else if(input[0].equals("all"))
            {
                set.clear();
                
                for(int j=1; j<=20; j++)
                {
                    set.add(j + "");
                }
            }
            else if(input[0].equals("empty"))
            {
                set.clear();
            }
        }
        
        System.out.println(sb.toString());
        sc.close();
    }
}

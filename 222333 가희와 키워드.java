https://yoloaeee.tistory.com/308

==================================
  
import java.util.Scanner;
import java.util.HashSet;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        String buf = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++)
        {
            String temp = sc.nextLine();
            
            if(!set.contains(temp))
            {
                set.add(temp);
            }
        }
        for(int i=0; i<m; i++)
        {
            String[] temp = sc.nextLine().split(",");
            
            for(int j=0; j<temp.length; j++)
            {
                if(set.contains(temp[j]))
                {
                    set.remove(temp[j]);
                }
            }
            
            sb.append(set.size() + "\n");
        }
        
        System.out.print(sb.toString());
        sc.close();
        return;
    }
}

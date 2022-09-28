https://yoloaeee.tistory.com/253

============================================
  
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder buf = new StringBuilder();
        String[] input = sc.nextLine().split(" ");
        int temp = 0;
        
        for(int i=0; i<input.length; i++)
        {
            buf.append(input[i]);
            temp += Integer.parseInt(buf.reverse().toString());
            buf.delete(0, buf.length());
        }
        
        buf.append(temp);
        System.out.println(Integer.parseInt(buf.reverse().toString()));
        sc.close();
    }
}

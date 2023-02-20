https://yoloaeee.tistory.com/287

==========================================

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.math.BigDecimal;

public class Main
{
    public static void main(String[] args) throws NumberFormatException
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<BigDecimal> list = new ArrayList<BigDecimal>();
        String reg = "[^0-9]";
        int n = sc.nextInt();
        String buf = sc.nextLine();
        
        for(int i=0; i<n; i++)
        {
            String temp = sc.nextLine();
            String[] num = temp.replaceAll(reg, ",").split(",");
            
            for(String s : num)
            {
                if(!s.equals(""))
                {
                    list.add(new BigDecimal(s));
                }
            }
        }
        
        Collections.sort(list);
        
        for(BigDecimal b : list)
        {
            System.out.println(b);
        }
        
        sc.close();
        return;
    }
}

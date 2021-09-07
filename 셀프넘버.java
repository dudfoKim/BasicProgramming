https://yoloaeee.tistory.com/88

============================================================

public class Main
{
    public static int selfNumber(int n)
    {
        int result = n;
        String temp = n + "";
        
        for(int j=0; j<temp.length(); j++)   
        {
         result += Integer.parseInt(temp.charAt(j) + "");
        }
        
        if(result<10000)
        {
         return result;
        }
        else
        {
         return 0;
        }
    }
    
    public static void main(String[] args)
    {
          boolean[] chk = new boolean[10000];
    
          for(int i=1; i<=10000; i++)
          {
               chk[selfNumber(i)] = true;
          }
    
          for(int i=1; i<chk.length; i++)
          {
               if(!chk[i])
               {
                    System.out.println(i);
               }
          }
    }
}


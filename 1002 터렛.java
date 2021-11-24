https://yoloaeee.tistory.com/203

===================================

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int t = sc.nextInt();

        for(int i=0; i<t; i++)
        {
            int[] a = new int[2];
            int[] b = new int[2];
            
            for(int j=0; j<2; j++)
            {
                a[j] = sc.nextInt();
            }
            
            int r1 = sc.nextInt();
            
            for(int j=0; j<2; j++)
            {
                b[j] = sc.nextInt();
            }
            
            int r2 = sc.nextInt();
            
            double dist = Math.sqrt(Math.pow(a[0]-b[0],2)+Math.pow(a[1]-b[1],2));
            int sum = r1+r2;
            int diff = Math.abs(r1-r2);
            
            // case 1 : 기준 좌표가 같을 때
            if(a[0]==b[0] && a[1]==b[1])
            {
                // case 1-2 : 반지름도 같으면 접점 무한대
                if(diff==0)
                {
                    sb.append(-1 + "\n");
                }
                // case 1-2 : 반지름이 다르면 접점 0개
                else
                {
                    sb.append(0 + "\n");
                }
            }
            // case 2 : 두 원이 내접되거나 외접되면 접점 1개
            else if(diff==dist || sum==dist)
            {
                sb.append(1 + "\n");
            }
            // case 3 : 한 원이 다른 원 안에 들어가있거나 반지름의 합보다 더 멀리 떨어져있을 경우 접점 0개
            else if(diff>dist || dist>sum)
            {
                sb.append(0 + "\n");
            }
            // case 4 : 이외 케이스는 모두 접점 2개
            else
            {
                sb.append(2 + "\n");
            }
        }
        
        System.out.print(sb.toString());
        sc.close();
    }
}

https://yoloaeee.tistory.com/101

====================================================

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main
{
	// 2차원 좌표데이터 클래스
	static class point
	{
		int x;
		int y;
		
		point(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}
	
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<point> list = new ArrayList<point>();
        int t = sc.nextInt();
        
        for(int i=0; i<t; i++)
        {
        	// 입력받는 좌표데이터를 리스트에 add
        	list.add(new point(sc.nextInt(), sc.nextInt()));
        }
        
        // 정렬 실행
        Collections.sort(list, new Comparator<point>()
        {
			@Override
			public int compare(point o1, point o2)
			{
				// y좌표가 같지 않을 때에는 y좌표를 기준으로 오름차순 정렬
				if(o1.y!=o2.y)
				{
					return o1.y>o2.y?1:-1;
				}
				// y좌표가 같을 때에는 x좌표를 기준으로 오름차순 정렬
				else
				{
					return o1.x>o2.x?1:-1;
				}
			}
        	
		});
        
        for(point data : list)
        {
        	System.out.println(data.x + " " + data.y);
        }
    }
}

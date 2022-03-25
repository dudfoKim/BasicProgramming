https://yoloaeee.tistory.com/226

====================================================================

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main
{
	static class score
	{
		int index;
		int score;
		
		score(int index, int score)
		{
			this.index = index;
			this.score = score;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList<score> list = new ArrayList<score>();
		ArrayList<Integer> index = new ArrayList<Integer>();
		int sum = 0;
		
		for(int i=0; i<8; i++)
		{
			list.add(new score(i+1, sc.nextInt()));
		}
		
        // 점수 기준으로 내림차순 정렬
		Collections.sort(list, new Comparator<score>() {
			@Override
			public int compare(score s1, score s2)
			{
				return s2.score-s1.score;
			}
		});
		
        // 점수는 따로 더해주고, 인덱스는 따로 리스트에 저장
		for(int i=0; i<5; i++)
		{
			sum += list.get(i).score;
			index.add(list.get(i).index);
		}
		
		System.out.println(sum);
		
		Collections.sort(index);
		
		for(int i=0; i<5; i++)
		{
			System.out.print(index.get(i) + " ");
		}
				
		sc.close();
	}
}

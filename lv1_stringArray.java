package lv1_20210328;

import java.util.*;

// 프로그래머스 래벨1 문자열 내 마음대로 정렬하기
public class lv1_stringArray
{
	public static String[] solution(String[] strings, int n) 
	{
        String[] answer = new String[strings.length];
        String[] temp = new String[strings.length];

        for(int i=0; i<strings.length; i++)
        {
        	temp[i] = Character.toString(strings[i].charAt(n)) + strings[i];
        }
        
        Arrays.sort(temp); 
        
        for(int i=0; i<answer.length; i++)
        {
        	answer[i] = temp[i].substring(1, temp[i].length());
        }
        
        return answer;
    }
	
	public static void main(String[] args) 
	{
		String[] input = {"abce","cdx","abcd"};
		String[] result = solution(input, 2);
		
		for(String temp : result)
		{
			System.out.print(temp + " ");
		}
		
	}
}
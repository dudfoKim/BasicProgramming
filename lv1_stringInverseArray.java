package lv1_20210328;

import java.util.*;

// 프로그래머스 래벨1 문자열 내 마음대로 정렬하기
public class lv1_stringInverseArray
{
    public static String solution(String s) 
    {
        String answer = "";
        ArrayList<Character> list = new ArrayList<Character>();
        
        for(int i=0; i<s.length(); i++)
        {
        	list.add(s.charAt(i));
        }
        
        Collections.sort(list);
        
        for(int i=0; i<list.size(); i++)
        {
        	answer += list.get(list.size()-1-i);
        }
        
        return answer;
    }
	
	public static void main(String[] args) 
	{
		String s = "Zbcdefg";
				
		System.out.print(solution(s));;
	}
}
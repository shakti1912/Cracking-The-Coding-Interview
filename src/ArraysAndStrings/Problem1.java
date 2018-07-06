package ArraysAndStrings;

import java.util.HashMap;
import java.util.Set;

/* Done
 * Determine if a string has all unique characters. 
 */
public class Problem1 
{
	/*
	 * This is brute force. 
	 * Time: O(n^2)
	 * Space : O(1)
	 */
	public boolean unique(String s)
	{
		for(int i= 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			for(int j = i+1; j < s.length(); j++)
			{
				if(c == s.charAt(j))
				{
					return false;
				}			
			}
		}
		return true;	
	}
	
	/*
	 * Using HashMap.
	 * Time: O(n)
	 * Space: O(1)
	 */
	public boolean uniqueHash(String s)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < s.length(); i++)
		{
			char key = s.charAt(i);
			if(map.containsKey(key))
			{
				map.put(key, 2);	
			}
			else
			{
				map.put(key, 1);
			}
		}	
		Set<Character> set = map.keySet();
		for(char ch: set)
		{
			if(map.get(ch)>1)
			{
				return false;
			}
		}
		return true;
	}
}
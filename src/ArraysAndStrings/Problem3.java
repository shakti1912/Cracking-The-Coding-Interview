package ArraysAndStrings;

import java.util.Arrays;

/*Done
 * decide if one string is permutation of another.
 * Ask: case sensitive comparison and whitespace is significant
 */
public class Problem3
{
	/*
	 * Using sort. First sort both strings then compare if both are same or not.
	 * Time: O(nlogn)
	 * Space: O(n)
	 */
	public boolean permutation1(String s1, String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		char[] s11 = s1.toCharArray();
		char[] s22 = s2.toCharArray();
		Arrays.sort(s11);
		Arrays.sort(s22);
		String sorted1 = new String(s11);
		String sorted2 = new String(s22);
		if(sorted1.equals(sorted2))
		{
			return true;
		}
		return false;
	}
	/*
	 * Using something like hashing and compare second string characters with characters in hash.
	 * Time: O(n)
	 * Space: O(1)
	 */
	public boolean permutation2(String s1, String s2)
	{
		if(s1.length() != s2.length())
		{
			return false;
		}
		int[] letters = new int[256]; //assuming ASCII characters
		char[] s1_array = s1.toCharArray();
		for(char c: s1_array)
		{
			letters[c]++;
		}
		char[] s2_array = s2.toCharArray();
		for(int i = 0; i < s2_array.length; i++)
		{
			if(--letters[s2_array[i]] < 0)
			{
				return false;
			}
		}
		return true;
		
	}
	
	
	/*
	 * Using loop and contains methods. First get one character from one string and see if it is 
	 * present in another string. 
	 * Time: O(n*n)
	 * Space: O(1)
	 * This is a wrong approach. Take s1 as 'aaa' and s2 as 'abc'
	 */
	public boolean permutation(String s1, String s2)
	{
		for(int i = 0; i< s1.length(); i++)
		{
			String temp = s1.substring(i, i+1);
			if(!s2.contains(temp))
			{
				return false;
			}
		}
		return true;
	}
}

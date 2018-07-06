package ArraysAndStrings;

/* Done
 * reverse a string 
 */
public class Problem2 
{
	/*
	 * Using recursion.
	 * Time: O(1)
	 * Space: O(n)
	 */
	public String reverseRecursive(String s)
	{
		if(s.length() == 1)
		{
			return s.substring(0, 1);
		}
		return reverseRecursive(s.substring(1)) + s.substring(0,1);
	}
	/*
	 * Using loop.
	 * Time: O(n)
	 * Space: O(n)
	 */
	public String reverseLoop(String s)
	{
		String temp = "";
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			temp = c + temp;
		}
		return temp;
	}
	

}

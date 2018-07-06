package ArraysAndStrings;

public class Problem8
{
	/*
	 * Check if s2 is a rotation of s1.
	 * Solution is that first concatenate s2 string with itself. Then call isSubstring to
	 * find that original string s1 is a substring of new concatinated string.
	 * Time: O()
	 */
	public boolean isRotation(String s1 , String s2)
	{
		boolean ret = false;
		String s = "";
		s = s2 + s2;
		if(isSubstring(s, s1))
		{
			return true;
		}
		return false;
		
	}
	/*
	 * Check if s2 is a substring of s1
	 */
	public boolean isSubstring(String s1, String s2)
	{
		if(s1.contains(s2))
		{
			return true;
		}
		return false;
	}
	

}

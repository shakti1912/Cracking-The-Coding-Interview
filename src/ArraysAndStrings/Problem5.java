package ArraysAndStrings;

/*
 * compress string. For example: aabcccccaaa should become a2b1c5a3
 */
public class Problem5
{
	public String stringCompression(String s)
	{
		String ret = "";
		int count = 0;
		int index = 0;
		int j = 0;
		while(index < s.length())
		{
			char c = s.charAt(index);
			for(j = index; j < s.length(); j++)
			{ 
				if(c == s.charAt(j))
				{
					count++;
				}
				else
				{
					index = j;
					break;	
				}			
			}
			if(j == s.length())
			{
				index = j;
			}
			String toAdd = Character.toString(c) + count;
			ret = ret + toAdd;
			count = 0;
		}		
		return ret;		
	}
	public String stringCompression2(String s)
	{
		char[] arr = s.toCharArray();
		for(int i = 0 ; i < arr.length; i++)
		{
			
			
			
			
		}
	}
	
}

package ArraysAndStrings;

/* Done
 * replace space with %20 inplace.
 * 
 */
public class Problem4 
{
	/*
	 * using separate string.
	 * Time: O(n)
	 * Space: O(nx) where x = number of spaces * 2
	 */
	public String replaceSpaces(String s, int length)
	{
		String temp = "";
		for(int i =0; i < length; i++)
		{
			String t = s.substring(i,i+1);
			if(t.equals(" "))
			{
				temp = temp + "%20";
			}
			else
			{
				temp = temp + t;
			}			
		}
		return temp;		
	}
	
	/*
	 * in place replacement.
	 * Time: O(n)
	 * Space: O(1)
	 * 
	 */
	public String replaceSpaces2(String s, int length)
	{
		char[] arr = s.toCharArray();
		for(int i = 0; i < arr.length ; i++)
		{
			if(arr[i] == ' ')
			{
				insertShift(arr, i, length);
				length += 2;
			}
		}
		String res = new String(arr);
		return res;
		
	}
	public void insertShift(char[] a, int index, int length)
	{
		
		for(int i = length-1; i > index  ; i--)
		{
			a[i+2] = a[i];	
		}
		//now you have 3 indexes empty put %20 in there
		a[index] = '%';
		a[index+1] = '2';
		a[index+2] = '0';
		
	}
		
	
	/*
	 * 
	 *
	public char[] replaceSpacesUsingArray(char[] x, int length)
	{
		//char c = '%20';
		for(int i = 0; i < length; i++)
		{
			char c = x[i];
			if(c == ' ')
			{
				
				
			}
		}
		
	}
	public  int insert(int[] a, int insertKey, int n)
	{
		if(n >= a.length)
		{
			return -1;
		}
		int index = 0;
		for(int i = 0; i < n; i++)
		{
			if(a[i] > insertKey)
			{
				index = i;
				break;
			}
		}
		for(int i = n+1; i>index; i--)
		{
			a[i] = a[i-1];

		}
		a[index] = insertKey;
		return index;

	}
	*/
	
}

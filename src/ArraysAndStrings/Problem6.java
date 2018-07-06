package ArraysAndStrings;

public class Problem6 
{
	/*
	 * rotate given matrix by 90 degrees in clockwise direction.
	 * Using extra space.
	 * Time: O(n2)
	 * Space: O(n2) 
	 * 
	 */
	
	
	public int[][] rotate(int[][] n)
	{
		int[][] temp = new int[n.length][n[0].length];
		int index = 2;
		for(int i = 0; i < n.length; i++)
		{
			for(int j = 0; j < n.length; j++)
			{
				temp[j][index] = n[i][j];
				
			}
			index--;
		}
		return temp;
		
		
		
		
		
	}

}

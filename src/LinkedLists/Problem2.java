package LinkedLists;

public class Problem2
{
	public Node kthToLast(LinkedList list, int k) throws Exception
	{
		Node current = list.head;
		Node kth = current;
		while(k > 0 && current != null)
		{
			current = current.next;	
			k--;
		}
		if(k > 0 && current == null)
		{
			throw new Exception("k is more than length of the linked list.");
		}
		while(current != null)
		{
			current = current.next;
			kth =kth.next;
		}
		return kth;		
		
	}

}

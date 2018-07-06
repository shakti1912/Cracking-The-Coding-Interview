package LinkedLists;

import java.util.HashMap;

/*
 * remove duplicates from an unsorted linked list.
 */
public class Problem1 
{
	/*
	 * using hashmap
	 */
	public void removeDuplicates(LinkedList list)
	{
		HashMap<Object, Integer> map = new HashMap<Object, Integer>();
		Node current = list.head;
		Node prev = null;
		while(current != null)
		{
			if(!map.containsKey(current.data))
			{
				map.put(current.data, 1);
				prev = current;
				current = current.next;	
				continue;		
			}
			prev.next = current.next;
			current = current.next;		
		}	

	}

	/*
	 * If no temporary buffer
	 */
	public void removeDuplicates2(LinkedList list)
	{
		Node current = list.head;
		Node prev = null;

		while(current != null)
		{

			helper(current.next, prev, current);
			current = current.next;

		}
	}

	public void helper(Node node, Node prev,  Node toDel)
	{
		if(node == null)
		{
			return;
		}
		if(node.data == toDel.data)
		{
			prev.next = node.next;
			node = node.next;

		}
		else
		{
			prev = node;
			node = node.next;
		}
		helper(node, prev, toDel);

	}


}

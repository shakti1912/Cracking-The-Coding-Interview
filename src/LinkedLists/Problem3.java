package LinkedLists;

public class Problem3 
{
	public void deleteNode(Node del)
	{
		System.out.println("Deleting node with data " + del.data);
		if(del == null)
		{
			return;
		}
		if(del.next == null)
		{
			//this is the last node
			del.data = Integer.MIN_VALUE;
			return;
		}
		Node nextNode = del.next;
		del.data = nextNode.data;
		
		//now delete nextNode
		del.next = nextNode.next;
	}

}

package LinkedLists;

public class Tester 
{
	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.insert(50);
		l.insert(2);
		l.insert(10);
		l.insert(2);
		l.insert(3);
		l.insert(6);	
		l.insert(3);
		l.traversal();
		//Problem1 p1 = new Problem1();
		//p1.removeDuplicates2(l);
		
		//l.traversal();
		
		Problem2 p2 = new Problem2();
		
		Node k = null;
		int i = 0;
		try {
			k = p2.kthToLast(l, 8);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("k is more than length of the linked list");
			i++;
		}
		if(i == 0)
		{
			System.out.println("Desired element is " + k.data);	
		}
		
		LinkedList l2 = new LinkedList();
		Node f = new Node(2);
		Node s = new Node(3);
		Node t = new Node(4);
		Node fo = new Node(5);
		Node fi = new Node(6);
		
		l2.head = f;
		f.next = s;
		s.next = t;
		t.next = fo;
		fo.next = fi;
		
		Problem3 p3 = new Problem3();
		l2.traversal();
		p3.deleteNode(fi);
		l2.traversal();
		
		
		
		
	}
}

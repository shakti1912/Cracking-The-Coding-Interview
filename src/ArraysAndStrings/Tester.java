package ArraysAndStrings;

public class Tester
{
	public static void main(String[] args)
	{
		//p1Tester();
		//p2Tester();
		//p3Tester();
		//p4Tester();
		p5Tester();
		//p8Tester();
		//p6Tester();
	}
	public static void p1Tester()
	{
		System.out.println("Problem1 tests: ");
		Problem1 p1 = new Problem1();
		System.out.println(p1.unique("aashakti"));
		
		System.out.println(p1.uniqueHash(" "));
		
	}
	public static void p2Tester()
	{
		System.out.println("Problem2 tests: ");
		Problem2 p2 = new Problem2();
		String s = p2.reverseRecursive("Shakti");
		System.out.println(s);
		
		String s2 = p2.reverseLoop("Geeks for Geeks");
		System.out.println(s2);
		
	}
	public static void p3Tester()
	{
		System.out.println("Problem3 tests: ");
		Problem3 p3 = new Problem3();
		boolean b = p3.permutation1("Shakti", "aktiSh");
		System.out.println(b);
		
		boolean b2 = p3.permutation1("Geeks for Geeks", "skeeGrofskeeG");
		System.out.println(b2);
		
		boolean b3 = p3.permutation2("Shakti", "aktiSh");
		System.out.println(b3);
		
		boolean b4 = p3.permutation2("Geeks for Geeks", "skeeGrofskeeG");
		System.out.println(b4);
		
		
		
	}
	public static void p4Tester()
	{
		System.out.println("Problem4 tests: ");
		Problem4 p4 = new Problem4();
		String b = p4.replaceSpaces2("Mr John Smith    ", 13);
		System.out.println(b);
	}
	public static void p5Tester()
	{
		System.out.println("Problem5 tests: ");
		Problem5 p5 = new Problem5();
		String b = p5.stringCompression("aabcccccaaa");
		System.out.println(b);
	}
	public static void p8Tester()
	{
		System.out.println("Problem8 tests: ");
		Problem8 p8 = new Problem8();
		boolean b = p8.isRotation("waterbottle", "erbottlewat");
		System.out.println(b);
	}
	public static void p6Tester()
	{
		System.out.println("Problem6 tests: ");
		Problem6 p6 = new Problem6();
		int[][] n = {{1,2,3},
					{4,5,6},
					{7,8,9}};
		int[][] b = p6.rotate(n);
		for(int i = 0; i< b.length; i++)
		{
			for(int j = 0; j < b[0].length; j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
	}
	
	
}

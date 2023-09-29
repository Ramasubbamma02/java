
public class su {
	intba=10,b=20;
	void v()
	{
		System.out.println(a);
		System.out.println(b);
	}
Class su1 extends su
{
	int c=30;
	void tae()
	{
		System.out.println(c);
	}
}
class su2 extends su1
{
	void taeh()
	{
	System.out.println("haaaaaaaaaaaaaahiiii");
}
}
public class Hierarchyinheritance
{
	public static void maun(String[]args) {
		/*su1 ob=new su1();
		 * ob.tae();
		 * ob.v();*/
		su2 obj=new su2();
		obj.taeh();
		obj.v();
		
	}
}

}

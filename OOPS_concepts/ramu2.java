
public class ramu2 {
int  a=10,b=20;
void v()
{
	System.out.println(a);
	System.out.println(b);
}
class ramu3 extends ramu2
{
	int c=30;
	void tae()
	{
		System.out.println(c);
	}
}
class ramu4 extends ramu2{
	void taeh()
	{
		Sysetm.out.println("hiiiiiiiiiiiiiheeeeeeee");
	}
}
public class MultilevelInheritance{
	public static void main(String[]args)
	{
		/*ramu4 obj=new ramu4():
		 obj.taeh();
		 obj.tae();
		 obj.v();*/
		 */
		ramu3 ob=new ramu3();
		ob.tae();
		ob.v();
	}
}
}

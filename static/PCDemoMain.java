class PCDemo1
{
	static private int x;
	private PCDemo1()
	{
		x=10;
	}
	static public void display()
	{
		System.out.println(x);
	}
	public static PCDemo1 CreateObject()
	{
		PCDemo1 obj=new PCDemo1();
		return obj;
	}
}
class PCDemoMain
{
	public static void main(String dt[])
	{
		PCDemo1 obj=PCDemo1.CreateObject();
		obj.display();
	}
}
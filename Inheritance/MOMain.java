class MOBase
{	
	public void display()
	{
		System.out.print("Hello");
	}
}
class MODerived1 extends MOBase
{
	public void display()
	{
		super.display();
		System.out.print(" World");
	}
}
class MOMain
{
	public static void main(String dt[])
	{
		MOBase obj=new MOBase();
		obj.display();
		System.out.print("\n");
		MODerived1 obj1=new MODerived1();
		obj1.display();
	}
}
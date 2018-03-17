class CountObject
{
	static int inc=0;
	public CountObject()
	{
		inc++;
	}
	static public void count_object()
	{
		System.out.print("\n"+inc);
	}
}
class CountObjectMain
{
	public static void main(String dt[])
	{
		CountObject.count_object();
		CountObject obj=new CountObject();
		obj.count_object();
		CountObject obj2=new CountObject();
		obj.count_object();
		CountObject obj3;
	}
}
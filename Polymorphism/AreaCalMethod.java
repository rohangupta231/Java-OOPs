class Area
{	
	private double l;
	private double b,a;
	public Area()
	{
	this.l=0;
	this.b=0;
	this.a=0;
	}
	public void input(int l,double b)
	{
		this.l=l;
		this.b=b;
		this.a=0;
	}
	public void input(int l)
	{
		this.l=l;
		this.b=l;
		this.a=0;
	}
	public void input(int l,int b)
	{
		this.l=l/2;
		this.b=b;
		this.a=0;
	}
	public void input(double b)
	{
		this.l=b;
		this.b=3.14*b;
		this.a=0;
	}
	public void Cal()
	{
		this.a=this.l*this.b;
	}
	public void display()
	{
		System.out.print("\nArea is "+a);
	}
}
class AreaCalMethod
{
	public static void main(String dt[])
	{
		Area obj= new Area();
		obj.input(4,2.0);
		obj.Cal();
		Area obj1= new Area();
		obj1.input(3);
		obj1.Cal();
		Area obj2= new Area();
		obj2.input(4,3);
		obj2.Cal();
		Area obj3= new Area();
		obj3.input(4.0);
		obj3.Cal();
		obj.display();
		obj1.display();
		obj2.display();
		obj3.display();
	}
}
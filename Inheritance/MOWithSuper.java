class Dimension
{	
	protected int l,b;
	public Dimension()
	{
		l=b=0;
	}
	public Dimension(int s)
	{
		l=b=s;
	}
	public Dimension(int i,int j)
	{
		l=i;
		b=j;
	}
	public void display()
	{
		System.out.println("length= "+l+"\nbreath= "+b);
	}
}
class Area	extends Dimension
{
	public int a;
	public Area()
	{
		super();
	}
	public Area(int s)
	{
		super(s);
	}
	public Area(int i,int j)
	{
		super(i,j);
	}
	/*public void area()
	{
		a=l*b;
		System.out.println("Area= "+a+"m^2");
	}*/
	public void display()
	{
		super.display();
		System.out.println("Area= "+(l*b));
	}
}
class Volume extends Area
{
	public int h,v;
	public Volume()
	{
		super();
	}
	public Volume(int s)
	{
		super(s);
		h=s;
	}
	public Volume(int i,int j,int k)
	{
		super(i,j);
		h=k;
	}
	/*public void volume()
	{
		v=l*b*h;
		System.out.println("Volume= "+v+"");
	}*/
	public void display()
	{
		System.out.println("Length= "+l);
		System.out.println("Breadth= "+b);
		System.out.println("Height= "+h);
		System.out.println("Area= "+(l*b));
		System.out.println("Volume= "+(l*b*h));
	}
}
class MOWithSuper
{
	public static void main(String dt[])
	{
	Dimension obj=new Dimension(10,5);
	obj.display();
	System.out.print("\n");
	Area obj1=new Area(10,5);
	obj1.display();
	//obj1.area();
	System.out.print("\n");
	Volume obj3=new Volume(10,5,2);
	obj3.display();
	//obj3.area();
	//obj3.volume();
	}
}
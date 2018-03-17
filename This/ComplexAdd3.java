class Complex
{
	private int r,im;
	public Complex()
	{
		r=0;
		im=0;
	}
	public Complex(int i, int j)
	{
		r=i;
		im=j;
	}
	public void input(int i,int j)
	{
		r=i;
		im=j;
	}
	public void display()
	{
		System.out.print(r+"+i"+im+"\n");
	}
	public void add(Complex x,Complex y)
	{
		this.r=x.r+y.r;
		this.im=x.im+y.im;
	}
}
class ComplexAdd3
{
	public static void main(String dt[])
	{
		Complex c1=	new Complex();
		Complex c2= new Complex();
		Complex c3= new Complex();
		c1.input(2,3);
		c2.input(3,3);
		c3.add(c1,c2);
		c1.display();
		c2.display();
		c3.display();
	}	
}
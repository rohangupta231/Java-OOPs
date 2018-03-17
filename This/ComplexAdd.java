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
	public Complex add(Complex x,Complex y)
	{
		Complex sum= new Complex();
		sum.r=x.r+y.r;
		sum.im=x.im+y.im;
		return sum;
	}
}
class ComplexAdd
{
	public static void main(String dt[])
	{
		Complex c1=	new Complex();
		Complex c2= new Complex();
		Complex c3;
		c1.input(2,3);
		c2.input(3,3);
		c3=c2.add(c1,c2);
		c1.display();
		c2.display();
		c3.display();
	}	
}





























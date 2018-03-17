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
	public Complex add(Complex x)
	{
		Complex sum= new Complex();
		sum.r=x.r+this.r;
		sum.im=x.im+this.im;
		return sum;
	}
}
class ComplexAdd2
{
	public static void main(String dt[])
	{
		Complex c1=	new Complex();
		Complex c2= new Complex();
		Complex c3;
		c1.input(2,3);
		c2.input(3,3);
		c3=c2.add(c1);
		c1.display();
		c2.display();
		c3.display();
	}	
}





























class Rational
{
	private int num,dem;
	public Rational()
	{
		num=0;
		dem=0;
	}
	public void input(int i,int j)
	{
		num=i;
		dem=j;
	}
	public void display()
	{
		System.out.print(num+"/"+dem+"\n");
	}
	public void add(Rational x,Rational y)
	{
		//Rational sum=new Rational();
		this.num=y.dem*x.num+y.num*x.dem;
		this.dem=x.dem*y.dem;
	}
	public void sub(Rational x,Rational y)
	{
		//Rational dif=new Rational();
		this.num=y.dem*x.num-y.num*x.dem;
		this.dem=x.dem*y.dem;
	}
	public void	mul(Rational x,Rational y)
	{
		//Rational pro=new Rational();
		this.num=x.num*y.num;
		this.dem=x.dem*y.dem;
	}
	public	void Simplify()
	{
		int i;
		for(i=num*dem;i>1;i--)
		{
			if((num%i==0)&&(dem%i==0))
			{
				num=num/i;
				dem=dem/i;
			}
		}
	}	
}
class RationalOperation2
{
	public static void main(String dt[])
	{
		Rational r1=new Rational();
		Rational r2=new Rational();
		Rational r3=new Rational();
		r1.input(2,4);
		r2.input(2,4);
		r1.display();
		r2.Simplify();
		r2.display();
		r3.add(r1,r2);
		r3.display();
		r3.sub(r1,r2);
		r3.display();
		r3.mul(r1,r2);
        r3.display();
	}
}
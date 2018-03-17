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
	public Rational add(Rational x)
	{
		Rational sum=new Rational();
		sum.num=this.dem*x.num+this.num*x.dem;
		sum.dem=x.dem*this.dem;
		Simplify(sum);
		return sum;
	}
	public Rational sub(Rational x)
	{
		Rational dif=new Rational();
		dif.num=this.dem*x.num-this.num*x.dem;
		dif.dem=x.dem*this.dem;
		Simplify(dif);
		return dif;
	}
	public Rational mul(Rational x)
	{
		Rational pro=new Rational();
		pro.num=x.num*this.num;
		pro.dem=x.dem*this.dem;
		Simplify(pro);
		return pro;
	}
	public Rational	Simplify(Rational x)
	{
		int i;
		for(i=x.num*x.dem;i>1;i--)
		{
			if((x.num%i==0)&&(x.dem%i==0))
			{
				x.num=x.num/i;
				x.dem=x.dem/i;
			}
		}
		return x;
	}	
}
class RationalOperation1
{
	public static void main(String dt[])
	{
		Rational r1=new Rational();
		Rational r2=new Rational();
		Rational r3,r4,r5;
		r1.input(2,4);
		r2.input(2,3);
		r3=r2.add(r1);
		r4=r2.sub(r1);
		r5=r2.mul(r1);
		r2.Simplify(r2);
		r1.display();
		r2.display();
		r3.display();
		r4.display();
		r5.display();
	}
}
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
		System.out.print(" \n"+r+"+i"+im);
	}
	public Complex add(Complex x,Complex y)
	{
		Complex sum= new Complex();
		sum.r=x.r+y.r;
		sum.im=x.im+y.im;
		return sum;
	}
}
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
		System.out.print("\n "+num+"/"+dem);
	}
	public Rational add(Rational x, Rational y)
	{
		Rational sum=new Rational();
		sum.num=y.dem*x.num+y.num*x.dem;
		sum.dem=x.dem*y.dem;
		Simplify(sum);
		return sum;
	}
	/*public Rational sub(Rational x,Rational y)
	{
		Rational dif=new Rational();
		dif.num=y.dem*x.num-y.num*x.dem;
		dif.dem=x.dem*y.dem;
		Simplify(dif);
		return dif;
	}
	public Rational mul(Rational x,Rational y)
	{
		Rational pro=new Rational();
		pro.num=x.num*y.num;
		pro.dem=x.dem*y.dem;
		Simplify(pro);
		return pro;
	}*/
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
class Time
{
	private int h,m,s;
	public Time()
	{
		h=0;
		m=0;
		s=0;
	}
	public void input(int i,int j,int k)
	{
		h=i;
		m=j;
		s=k;
	}
	public void display()
	{
		System.out.print("\n "+h+":"+m+":"+s);
	}
	public Time add(Time x,Time y)
	{
		Time sum=new Time();
		sum.s=x.s+y.s;
		sum.m=x.m+y.m;
		sum.h=x.h+y.h;
		if(sum.s>=60)
		{
			sum.s=sum.s-60;
			sum.m=sum.m+1;
		}
		if(sum.m>=60)
		{
			sum.m=sum.m-60;
			sum.h=sum.h+1;
		}
		return sum;
	}
}
class Add
{
	public int add(int l,int h)
	{
		return l+h;
	}
	public long add(long l,long h)
	{
		return l+h;
	}
	public short add(short l,short h)
	{
		int a,b,c;
		a=l;
		b=h;
		c=a+b;
		return (short)c;		
	}
	public float add(float l,float h)
	{
		return l+h;
	}
	public double add(double l,double h)
	{
		return l+h;
	}
	public char add(char l,char h)
	{	
		int a,b,c;
		a=l;
		b=h;
		c=a+b;
		return (char)c;
	}
	public String add(String l,String h)
	{
		return l+h;
	}
	public Complex add(Complex x,Complex y)
	{
		Complex c=new Complex();
		return c.add(x,y);
	}
	public Time add(Time x,Time y)
	{
		Time t=new Time();
		return t.add(x,y);
	}
	public Rational add(Rational x,Rational y)
	{
		Rational r=new Rational();
		return r.add(x,y);
	}
}
class AddAny
{
	public static void main(String dt[])
	{
		Add obj=new Add();
		System.out.print("\n "+obj.add(2,3));
		Add obj1=new Add();
		System.out.print("\n "+obj1.add(2,3));
		Add obj2=new Add();
		System.out.print("\n "+obj2.add(2,3));
		Add obj4=new Add();
		System.out.print("\n "+obj4.add(4.0,5.0));
		Add obj5=new Add();
		System.out.print("\n "+obj5.add(4.312312,5.213123));
		Add obj6=new Add();
		System.out.print("\n "+obj6.add('a','b'));
		Add obj8=new Add();
		System.out.print("\n "+obj8.add("Hello","World"));
		Complex c1=new Complex();
		c1.input(3,5);
		Complex c2=new Complex();
		c2.input(1,2);
		Complex c3;
		Add obj9=new Add();
		c3=obj9.add(c1,c2);
		c3.display();
		Time t1=new Time();
		t1.input(3,4,5);
		Time t2=new Time();
		t2.input(1,1,1);
		Time t3;
		Add obj10= new Add();
		t3=obj10.add(t1,t2);
		t3.display();
		Rational r1=new Rational();
		r1.input(1,4);
		Rational r2=new Rational();
		r2.input(1,4);
		Rational r3;
		Add obj11=new Add();
		r3=obj11.add(r1,r2);
		r3.display();
	}
}
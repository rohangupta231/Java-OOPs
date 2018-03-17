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
		System.out.print(h+":"+m+":"+s+"\n");
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
class TimeAdd
{
	public static void main(String dt[])
	{
		Time t1=new Time();
		Time t2=new Time();
		Time t3;
		t1.input(45,45,45);
		t2.input(24,45,30);
		t3=t2.add(t1,t2);
		t1.display();
		t2.display();
		t3.display();
		
	}
}
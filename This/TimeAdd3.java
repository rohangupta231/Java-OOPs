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
	public void add(Time x,Time y)
	{
		this.s=x.s+y.s;
		this.m=x.m+y.m;
		this.h=x.h+y.h;
		if(this.s>=60)
		{
			this.s=this.s-60;
			this.m=this.m+1;
		}
		if(this.m>=60)
		{
			this.m=this.m-60;
			this.h=this.h+1;
		}
	}
}
class TimeAdd3
{
	public static void main(String dt[])
	{
		Time t1=new Time();
		Time t2=new Time();
		Time t3=new Time();
		t1.input(45,45,45);
		t2.input(24,45,30);
		t3.add(t1,t2);
		t1.display();
		t2.display();
		t3.display();
		
	}
}
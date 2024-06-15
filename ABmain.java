class A
{
   int a;
    public void getdata()
	{
	  a=5;
	  
	}
	public void putdata()
	{
	   System.out.println("A value :"+ a); 
	}
}
class B extends A
{
    int b,c;
    public void getdata()
	{
	 
	  b=2;
	  super.getdata();
	  c = a + b;
	}
	public void putdata()
	{
		super.putdata();
	   System.out.println("c value :"+ c); 
	}
}
class ABmain
{
   public static void main(String arg[])
   {
      
	  B BB = new B();
	  BB.getdata();
	  BB.putdata();
   }
}

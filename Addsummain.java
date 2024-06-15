class Addsum
{
   int a,b,c;
   Addsum(int a,int b)
   {
      this.a = a;
      this.b = b;
    }
   public void sum()
   {
     c = a + b;
   }
   public void show()
   {
     System.out.println(c);
   }
}
class Addsummain
{
   public static void main(String arg[])
   {  
      int a,b;
      a=5;b=2;
        Addsum A = new Addsum(a,b);
        A.sum();
       A.show();
   }
}
import java.util.*;
class Add
{ 
    int a=-1,b=1,c,i;
   
   public void sum(int n)
   {
   
  int f=n;
for(i=1;i<=f;i++){
      c=a+b;
      
   
  
       
       System.out.print(c+" "); 
a=b;
b=c;
   }
}
}
class Addmain
{
    public static void main(String arg[])
   {
     Scanner in=new Scanner(System.in);
        Add A = new Add();
         int n=in.nextInt();
      A.sum(n);
 
     
   }
}
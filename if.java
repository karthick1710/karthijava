import java.util.*;
class If
{
public static void main(String arg[])
{
 int a,b,c;
 Scanner in=new Scanner(System.in);
 System.out.println("enter a:");
 a=in.nextInt();
 System.out.println("Enter b:");
 b=in.nextInt();
 if(a>b)
   c=a;
 else
  c=b;
System.out.println("C="+c);
}
}
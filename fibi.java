import java.util.*;
class fib
{
public static void main(String arg[])
{
int x,y,i,z,n;
Scanner in = new Scanner(System.in);
System.out.println("Enter the no of values:");
n=in.nextInt();
x=-1;
y=1;
i=1;
z=0;
while(i<=n)
{
z=x+y;
System.out.println(z);
x=y;
y=z;
i++;
}
}
}
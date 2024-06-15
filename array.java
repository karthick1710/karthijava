import java.util.*;
class single
{
public static void main(String arg[])
{
int x[]=new int[10];
int y[]=new int[10];
int z[]=new int[10];
int i,n,k,m=0,l=0;
Scanner in=new Scanner(System.in);
System.out.println("Give the n value:");
n=in.nextInt();
System.out.println("Give value one by one:");
for(i=0;i<n;i++)
{
  x[i]=in.nextInt();
}
System.out.println("Give value one by one:");
for(i=0;i<n;i++)
{
  y[i]=in.nextInt();
}
System.out.println("elements are:");
k=0;
for(i=0;i<10;i+=2)
{
z[i]=x[k];
k++;
}
k=0;
for(i=1;i<10;i+=2)
{
z[i]=y[k];
k++;
}
for(i=0;i<10;i++)
{
System.out.println(z[i]);
}
for(i=0;i<10;i++)
{
if(z[i]%2==0)
m=m+1;
else
l=l+1;
}
System.out.println("odd"+l+"even"+m);
}
}

import java.util.*;
class Strmethod
{
public static void main(String arg[])
{
String str;
int i,j,n;
Scanner in=new Scanner(System.in);
System.out.println("Give the name:");
str=in.nextLine();
System.out.println(str);
n=str.length();
for(i=0;i<=n;i++)
{
for(j=0;j<i;j++)
{
System.out.print(str.charAt(j));
}
System.out.println();
}
for(i=n;i>=0;i--)
{
for(j=0;j<i;j++)
{
System.out.print(str.charAt(j));
}
System.out.println();
}
}
}
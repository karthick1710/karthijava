import java.util.*;
class world
{
public static void main(String arg[])
{
  StringBuffer name = new StringBuffer("Java");
  Scanner in = new Scanner(System.in);
  System.out.println("Give the line:");
   String str1=in.nextLine(); 
  name.insert(4," ");
  name.append(str1);
  System.out.println(name);
}
}

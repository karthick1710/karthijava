import java.util.*;
import java.io.*;
class happy
{
public static void main(String arg[])
{
   StringBuffer str1;
   String str2;
   DataInputStream  in = new DataInputStream(System.in);
   System.out.println("Give the String 1:");
   str2=in.readLine();
   str1=str2;
   str2.reverse();
   if(str1.equals(str2))
        System.out.println(str1+"is  pallindrome");
   else
        System.out.println(str1+"is not pallindrome");
}
}
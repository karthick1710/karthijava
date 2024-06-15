import java.util.*;

class Mark
{
  int regno,tam,eng,mat,sci,soc,tot;
  String name;
  float avg;
  
   public void getdata()
{
   Scanner in=new Scanner(System.in);
   System.out.println("RegNo.:");
   regno=in.nextInt();
   System.out.println("Name:");
   name=in.next();
   System.out.println("Tamil:");
   tam=in.nextInt();
   System.out.println("English:");
   eng=in.nextInt();
   System.out.println("Maths:");
   mat=in.nextInt();
   System.out.println("Science:");
   sci=in.nextInt();
   System.out.println("Social:");
   soc=in.nextInt();
}
 public void cal()
{
  tot=tam+eng+mat+sci+soc;
  avg=tot/5;
}
public void show()
{
System.out.println("Reg.No,:"+regno);
System.out.println("Name:"+name);
System.out.println("Tamil:"+tam);
System.out.println("English:"+eng);
System.out.println("Maths:"+mat);
System.out.println("Science:"+sci);
System.out.println("Social:"+soc);
System.out.println("Total:"+tot);
System.out.println("Average:"+avg);
}
}
class Markmain
{
public static void main(String arg[])
{
Mark m=new Mark();
m.getdata();
m.cal();
m.show();
}
}
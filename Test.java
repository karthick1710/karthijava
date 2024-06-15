import java.util.*;
class Test
{
  public static void main(String arg[])
  {

  int tam,eng,mat,sci,soc,tot;
  float avg;
  Scanner in = new Scanner(System.in);
  System.out.println("Enter the tamil mark:");
  tam=in.nextInt();
  System.out.println("Enter the english mark:");
  eng=in.nextInt();
  System.out.println("Enter the maths mark:");
  mat=in.nextInt();
  System.out.println("Enter the science mark:");
  sci=in.nextInt();
  System.out.println("Enter the social mark:");
  soc=in.nextInt();
  tot=tam+eng+mat+sci+soc;
  System.out.println("Total:"+tot);
  avg=tot/5;
  System.out.println("Average:"+avg);
 }
}
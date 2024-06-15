import java.util.*;
class circle
{
   float radius,angle;
   circle(float radius,float angle){
   this.radius=radius;
   this.angle=angle;
  }
  public void circleCircumference(){
 double cir=2*3.14*radius;
System.out.println(cir);
}
public void arcLength(){
   double ar=angle*radius;
System.out.println(ar);
}
}
class circlemain{
public static void main(String arg[]){
Scanner in=new Scanner(System.in);
float radius=in.nextFloat();
float angle=in.nextFloat();
circle c=new circle(radius,angle);
c.circleCircumference();
c.arcLength();
}
}
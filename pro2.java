abstract class shape{
double area;
final double pi=22.0/7.0;
abstract double area();
}
class rectangle extends shape{
double length,breadth;
rectangle(double x,double y){
length=x;
breadth=y;
}
double area(){
area=length*breadth;
return area;
}
}
class circle extends shape{
double radius;
circle(double r){
radius=r;

}
double area(){
area=pi*radius*radius;
return area;
}
}
class pro2{
public static void main(String arg[]){
rectangle rr=new rectangle(6.0,4.0);
double ar=rr.area();
System.out.println(ar);
circle cc=new circle(5.25);
double cr=cc.area();
System.out.println(cr);
}
}
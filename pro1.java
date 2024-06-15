class cls{
int i;
}
class cls1 extends cls{
int i;
cls1(int x,int y){
i=x;
super.i=y;
}
void display(){
System.out.println(i);
System.out.println(super.i);
}
}
class pro1{
public static void main(String arg[]){
cls1 c=new cls1(5,7);
c.display();
}
}
class conmain
{
int i,j;
  conmain(int x,int y){
  i=x;
  j=y;
  }
  }
class sub1 extends conmain{
int k;
sub1(int x,int y,int z)
{
  super(x,y);
  k=z;
  }
  void display(){
  System.out.println(i);
  System.out.println(j);
  System.out.println(k);
  }
  }
  class pro{
  public static void main(String arg[]){
  sub1 s=new sub1(3,7,4);
  s.display();
  }
  }
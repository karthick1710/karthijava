import java.util.*;
class student{
int tam,eng,mat,sci,soc,tot;
void get(){
Scanner in=new Scanner(System.in);
System.out.println("Enter tamil mark:");
tam=in.nextInt();
System.out.println("Enter English mark:");
eng=in.nextInt();
System.out.println("Enter Maths mark:");
mat=in.nextInt();
System.out.println("Enter Science mark:");
sci=in.nextInt();
System.out.println("Enter Social mark:");
soc=in.nextInt();
}
void cal(){
tot=tam+eng+mat+sci+soc;
}
void show(){
System.out.println("Total:"+tot);
}
}
class Studentmain{
public static void main(String arg[]){
student s=new student();
s.get();
s.cal();
s.show();
}
}
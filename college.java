import java.util.*;
class college
{
String collegeName,principalName,place;
college(String  collegeName,String principalName,String place){
this.collegeName=collegeName;
this.principalName=principalName;
this.place=place;
}
void display(){
System.out.println(collegeName);
System.out.println(principalName);
System.out.println(place);
}
}
class collegemain
{
public static void main(String arg[]){
college c=new college("St Joseph","Karthi","Chennai");
c.display();
}
}
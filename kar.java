import java.io.*;
import java.util.*;
class kar{
public static void main(String arg[]){
try{
FileWriter fr=new FileWriter("sample.txt");
Scanner in=new Scanner(System.in);
String str=in.nextLine();
fr.write(str);
fr.close();
}
catch(IOException e){
System.out.println("Exception");
}
}
}
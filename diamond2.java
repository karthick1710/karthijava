import java.util.*;
class diamond2{
public static void main(String arg[]){
Scanner in =new Scanner(System.in);
int n=in.nextInt();
for(int i=1;i<=n;i++){
for(int j=1;j<=n-i;j++){
System.out.print(" ");
}
for(int j=1;j<=2*i-1;j++){
System.out.print("*");
}
for(int j=1;j<=n-i;j++){
System.out.print(" ");
}
System.out.println();
}
for(int i=0;i<n;i++){
for(int j=0;j<i;j++){
System.out.print(" ");
}
for(int j=0;j<2*n-(2*i+1);j++){
System.out.print("*");
}
for(int j=0;j<i;j++){
System.out.print(" ");
}
System.out.println();
}
}
}
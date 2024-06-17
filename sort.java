import java.util.*;
class main{
public static void main(String arg[]){
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=in.nextInt();
}
Arrays.sort(a);
for(int i=0;i<n;i++){
for(int j=n-1;j>i;j--){
   
   System.out.print(a[i]+" "+a[j]);
}
}
}
}
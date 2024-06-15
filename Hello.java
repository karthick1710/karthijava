import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		String[] s=str.split(" ");
		int n=s.length;
	    for(int i=0;i<n;i++)
	    {
	        int flag=0;
	        if(i==n-1)
	        {
	            System.out.print(s[n-1]);
	        }
	        else
	        {
	            char[] s1=s[i].toCharArray();
	            char[] s2=s[i+1].toCharArray();
	            for(int j=0;j<s2.length;j++)
	            {
	                for(int k=0;k<s1.length;k++)
	                {
	                    if(s2[j]==s1[k])
	                    {
	                        s1[k]='~';
	                    }
	                }
	            }
	            for(int l=0;l<s1.length;l++)
	            {
	                if(s1[l]!='~')
	                {
	                    System.out.print(s1[l]);
	                    flag=1;
	                }
	            }
	            if(flag==1)
	            {
	                System.out.print(" ");
	            }
	        }
	    }

	}
}
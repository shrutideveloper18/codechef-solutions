import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
		    int n=s.nextInt();
		    int fac=1;
		    
		    if(n==0||n==1){
		        System.out.println(1);
		    }
		    else{
		        
		        for(int j=1;j<=n;j++){
		            fac=fac*j;
		        }
		        System.out.println(fac);
		    }
		    
		}

	}
}

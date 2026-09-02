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
		   int m=s.nextInt();
		   int shoes=n*2;
		   if(m>=n){
		       System.out.println(n*2-m+n);
		   }
		   else if(m==0){
		       System.out.println(n*2);
		   }
		   else{
		       System.out.println((n-m)+n);
		   }
		    
		}

	}
}

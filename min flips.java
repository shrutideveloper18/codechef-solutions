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
		    int pos=0;
		    int neg=0;
		    for(int j=0;j<n;j++){
		        int a=s.nextInt();
		        if(a>0){
		            pos++;
		        }
		        else{
		            neg++;
		        }
		    }
		    if(n%2!=0){
		        System.out.println(-1);
		    }
		    else{
		        int diff=pos-neg;
		        System.out.println(Math.abs(diff)/2);
		}
		
		}

	}
}

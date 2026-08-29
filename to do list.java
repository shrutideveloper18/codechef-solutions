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
		    int q=0;
		    for(int j=0;j<n;j++){
		        int d=s.nextInt();
		        if(d<1000){
		            q++;
		        }
		    }
		    System.out.println(n-q);
		}

	}
}

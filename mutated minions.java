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
		    int k=s.nextInt();
		    int count=0;
		    for(int j=0;j<n;j++){
		        int a=s.nextInt();
		        int sc=a+k;
		        if(sc%7==0){
		            count++;
		        }
		    }
		    System.out.println(count);
		}
		
	    
	}
}

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
		    int a=s.nextInt();
		    int x=s.nextInt();
		    int b=s.nextInt();
		    int y=s.nextInt();
		    float sa=a/x;
		    float sb=b/y;
		    if(sa==sb){
		        System.out.println("equal");
		    }
		    else if(sa>sb){
		        System.out.println("alice");
		    }
		    else{
		        System.out.println("bob");
		    }
		    
		}

	}
}

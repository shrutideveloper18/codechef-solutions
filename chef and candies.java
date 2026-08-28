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
		    int x=s.nextInt();
		    int a=n-x;
		    if(x<n&&a%4==0){
		        System.out.println(a/4);
		    }
		    else if(x>n){
		        System.out.println(0);
		    }
		    else{
		        System.out.println((a/4)+1);
		    }
		}

	}
}

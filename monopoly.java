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
		    int p=s.nextInt();
		    int q=s.nextInt();
		    int r=s.nextInt();
		    int a=s.nextInt();
		    if(p>q+r+a||q>p+r+a||r>p+q+a||a>p+q+r){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}

	}
}

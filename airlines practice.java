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
		    int x=s.nextInt();
		    int n=s.nextInt();
		    int totalpassangers=x*100;
		    if(n<=totalpassangers){
		        System.out.println(0);
		    }
		    else if(n%100==0){
		        System.out.println(((n/100)-x));
		    }
		    else{
		        System.out.println(((n/100)+1)-x);
		    }
		}
	}
}

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
		    int a1=s.nextInt();
		    int a2=s.nextInt();
		    int a3=s.nextInt();
		    int b1=s.nextInt();
		    int b2=s.nextInt();
		    int b3=s.nextInt();
		    int scorea = (a1 + a2 + a3) - Math.min(a1, Math.min(a2, a3));
int scoreb = (b1 + b2 + b3) - Math.min(b1, Math.min(b2, b3));
		    if(scorea>scoreb){
		        System.out.println("alice");
		    }
		    else if(scorea<scoreb){
		        System.out.println("bob");
		    }
		    else{
		        System.out.println("tie");
		    }
		}
	}
}

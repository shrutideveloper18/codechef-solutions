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
		    if(n<=15&&n>10){
		        System.out.println("lower single");
		    }
		    else if(n<=15&&n<=10){
		        System.out.println("lower double");
		    }
		    else if(n>15&&n>25){
		        System.out.println("upper single");
		    }
		    else{
		        System.out.println("upper double");
		    }
		}

	}
}

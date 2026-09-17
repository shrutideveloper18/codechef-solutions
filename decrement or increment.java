import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%4==0){
		    System.out.println(n+1);
		}
		else{
		    System.out.println(n-1);
		}

	}
}

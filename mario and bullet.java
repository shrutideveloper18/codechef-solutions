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
		for(int i=0;i<n;i++){
		    int x=s.nextInt();
		    int y=s.nextInt();
		    int z=s.nextInt();
		    int time=y/x;
		    System.out.println(Math.max(0,z-time));
		}

	}
}

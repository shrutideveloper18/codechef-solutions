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
		    int x1=s.nextInt();
		    int y1=s.nextInt();
		    int x2=s.nextInt();
		    int y2=s.nextInt();
		    System.out.println(Math.max(Math.abs(x1-x2),Math.abs(y1-y2)));
		}

	}
}

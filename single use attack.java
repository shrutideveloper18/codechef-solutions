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
		    int h=s.nextInt();
		    int x=s.nextInt();
		    int y=s.nextInt();
		    int remainingHealth = h - y;
		    int normalAttacks = (remainingHealth + x - 1) / x;
		    int totalAttacks = 1 + Math.max(0, normalAttacks);
		    
		    System.out.println(totalAttacks);
		    
		}
	}
}

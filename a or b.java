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
		    int y=s.nextInt();
		    int scoreab=(500-(x*2))+(1000-((x+y)*4));
		    int scoreba=(1000-(y*4))+(500-((x+y)*2));
		    int maxscore=Math.max(scoreab,scoreba);
		    System.out.println(maxscore);
		}

	}
}

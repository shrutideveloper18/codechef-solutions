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
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int goldMedals = 0;
            
            // Chef wins gold in race X if the arch-rival is not participating in X
            if (x != a && x != b) {
                goldMedals++;
            }
            
            // Chef wins gold in race Y if the arch-rival is not participating in Y
            if (y != a && y != b) {
                goldMedals++;
            }
            
            System.out.println(goldMedals);}
	}
}

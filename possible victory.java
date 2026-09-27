import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		    int r=s.nextInt();
		    int o=s.nextInt();
		    int c=s.nextInt();
		    int rem=20-o;
		    int target=r-c;
		    if(rem*6*6>target){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
	}
}

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
		    int b1=s.nextInt();
		    int b2=s.nextInt();
		    int b3=s.nextInt();
		    int sum=b1+b2+b3;
		    if(sum==0||sum==1){
		        System.out.println("water filling time");
		    }
		    else{
		        System.out.println("not now");
		    }
		}

	}
}

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
		int max1=0;
		int sum1=0;
		int max2=0;
		int sum2=0;
		for(int i=0;i<t;i++){
		    int a=s.nextInt();
		    int b=s.nextInt();
		    sum1+=a;
		    sum2+=b;
		    if(sum1>sum2){
		        max1=Math.max(max1,sum1-sum2);
		    }
		    else{
		        max2=Math.max(max2,sum2-sum1);
		    }
		}
		if(max1>max2){
		    System.out.println("1 "+max1);
		}
		else{
		    System.out.println("2 "+max2);
		}
	}
}

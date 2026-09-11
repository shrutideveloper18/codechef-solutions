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
		    int a=s.nextInt();
		    int b=s.nextInt();
		    if(n%2==0){
		        System.out.println((n/2)*a+(n/2)*b);
		    }
		    else{
		        System.out.println((n/2)*a+((n/2)+1)*b);
		    }
		}

	}
}

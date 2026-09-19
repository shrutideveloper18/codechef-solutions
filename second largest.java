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
		    int a=s.nextInt();
		    int b=s.nextInt();
		    int c=s.nextInt();
		    if((a>=b&& a<=c)||(a>=c&&a<=b)){
		        System.out.println(a);
		    }
		    else if((b>=a&&b<=c)||(b>=c&&b<=a)){
		        System.out.println(b);
		    }
		    else if((c>=a&&c<=b)||(c>=b&&c<=a)){
		        System.out.println(c);
		    }
		    else{
		        System.out.println("no");
		    }
		}

	}
}

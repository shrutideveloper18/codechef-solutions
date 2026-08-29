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
		    int va=(a*100)/10;
		    int vb=(b*100)/20;
		    if(va>vb){
		        System.out.println("first");
		    }
		    else if(vb>va){
		        System.out.println("second");
		    }
		    else{
		        System.out.println("any");
		    }
		}

	}
}

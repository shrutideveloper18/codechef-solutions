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
		    int x=s.nextInt();
		    int y=s.nextInt();
		    if(a*y==b*x){
		        System.out.println("both");
		    }
		    else if(a*y>b*x){
		        System.out.println("chefina");
		    }
		    else{
		        System.out.println("chef");
		    }
		}
	}
}

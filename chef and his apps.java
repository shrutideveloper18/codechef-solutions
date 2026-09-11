import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int s=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int z=sc.nextInt();
		    int spaceleft=s-(x+y);
		    if(z<=spaceleft){
		        System.out.println(0);
		    }
		    else if(z<=spaceleft+Math.max(x,y)){
		        System.out.println(1);
		    }
		    else{
		        System.out.println(2);
		    }
		}

	}
}

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
		    int z=s.nextInt();
		    if(x%3!=0){
		        System.out.println((x)*y+(x/3)*z);
		    }
		    else if(x<3) {
		        System.out.println(x*y);
		    }
		    else{
		        System.out.println(x*y+(z*((x/3)-1)));
		    }
		}

	}
}

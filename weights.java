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
		    int w=s.nextInt();
		    int x=s.nextInt();
		    int y=s.nextInt();
		    int z=s.nextInt();
		    if(w==x||w==y||w==z||w==x+y||w==y+z||w==z+x||w==x+y+z){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}

	}
}

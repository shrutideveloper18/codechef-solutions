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
		    
		    if(n%3==1){
		        System.out.println("huge");
		        
		    }
		    else if(n%3==2){
		        System.out.println("small");
		    }
		    else{
		        System.out.println("normal");
		    }
		}

	}
}

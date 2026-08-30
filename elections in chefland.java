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
		    int x=s.nextInt();
		    int e=0;
		    for(int j=0;j<n;j++){
		        int a=s.nextInt();
		        if(a>=x){
		            e++;
		        }
		    }
		    System.out.println(e);
		}

	}
}

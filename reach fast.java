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
		    int k=s.nextInt();
		    if(b>a){
		        if((b-a)%k==0){
		            System.out.println((b-a)/k);
		        }
		        else{
		            System.out.println(((b-a)/k)+1);
		        }
		    }
		    else{
		        if((a-b)%k==0){
		            System.out.println((a-b)/k);
		        }
		        else{
		            System.out.println(((a-b)/k)+1);
		        }
		        
		    }
		}
	}
}

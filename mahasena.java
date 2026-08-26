import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int lucky=0;
		int unlucky=0;
		for(int i=0;i<n;i++){
		    int a=s.nextInt();
		    if(a%2==0){
		        lucky++;
		    }
		    else if(a%2==1){
		        unlucky++;
		    }
		}
		if(lucky>unlucky){
		    System.out.println("ready for battle");
		}
		else{
		    System.out.println("not ready");
		}

	}
}

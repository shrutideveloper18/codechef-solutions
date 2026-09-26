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
		    int r=s.nextInt();
		    int extra=r/30;
		    int sticks=x+extra;
		    if(sticks%y==0){
		        System.out.println(sticks/y);
		    }
		    else{
		        System.out.println((sticks/y)+1);
		    }
		}
	}
}

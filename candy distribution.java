
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
		    int n=s.nextInt();
		    int m=s.nextInt();
		    if(n%m==0&&(n/m)%2==0){
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		    
		}
    }
}

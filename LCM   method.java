public class Main
{
	public static int john(int a,int b)
	{
	    int big= Math.max(a,b);
	    int small= Math.min(a,b);
	    int s=big;
	    while(true)
	    {
	        if(big %small==0)
	        break;
	        big=big+s;
	    }
	    return big;
	}
	public static void main(String[] args){
	    int[] a={12,8,26,24,14,16,18,20};
	    int lcm=a[0];
	    for(int i=0;i<7;i++)
	    {
	        lcm =john(lcm,a[i]);
	    }
	    System.out.println("The LCM is"+lcm);
	}
}	

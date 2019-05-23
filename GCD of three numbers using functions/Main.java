import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int result=gcd(a,b);
      System.out.println(gcd(result,c));
	}
	public static int gcd(int a,int b)
    {
      int min=1;
      if(a>b)
        min=a;
      else
        min=b;
      while(min>=1)
      {
        if((a%min==0)&&(b%min==0))
        {return min;}
        min--;}
      return 0;}
}
import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=2;i<=n;i++)
      {if(isprime(i))
        System.out.println(i);}
	}
  public static boolean isprime(int i)
  {
    boolean isprime=true;
    for(int j=2;j<=i/2;j++)
    {if(i%j==0)
    {isprime=false;
     break;}}
  return isprime;}
}
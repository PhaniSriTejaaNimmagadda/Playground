import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     int a=n,b=n,count=0,sum=0;
      while(n>0)
      { 
        count++;
        n=n/10;}
      while(a>0)
      {
        int rem=a%10;
        int pow=1;
        for(int i=1;i<=count;i++)
        {pow=pow*rem;}
        sum=sum+pow;
       a=a/10;}
      if(sum==b)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}
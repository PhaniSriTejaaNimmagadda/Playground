import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc= new Scanner(System.in);
      int b=sc.nextInt();
      int e=sc.nextInt();
      System.out.println(power(b,e));
    }
  public static int power(int b,int e)
  {
    int sum=1;
    while(e>0)
    {
      sum=sum*b;
      e--;
    }
    return sum;
}}
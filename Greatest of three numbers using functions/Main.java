import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int result=greatest(a,b);
      System.out.println(greatest(result,c));
	}
  public static int greatest(int a, int b)
  {
    int max=0;
    if(a>b)
      max=a;
    else
      max=b;
    return max;}
}
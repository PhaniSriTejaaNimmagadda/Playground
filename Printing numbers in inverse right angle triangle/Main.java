import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
        int k=(n-(i-1));
        for(int j=1;j<=(n-(i-1));j++)
        { 
         System.out.print(k);
         k--;}
        System.out.println();}
	}
}
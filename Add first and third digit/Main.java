import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc= new Scanner(System.in);
      int a=sc.nextInt();
      int f=a/100;
      int l=a%10;
      System.out.println(f+l);
	}
}
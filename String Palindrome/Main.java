import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc=new Scanner(System.in);
      String a=sc.nextLine();
      int n=a.length();
     // string temp="";
     int f=0;
      int l=n-1;
      int ispalindrome=1;
      while(f<l)
      { if(a.charAt(f)!=a.charAt(l))
      {ispalindrome=0;
       break;}
      f++;
      l--;}
      if(ispalindrome==1)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}
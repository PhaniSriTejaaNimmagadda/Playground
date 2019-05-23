import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    String b=sc.nextLine();
    int count=0;
    for(int i=0;i<(a.length()-b.length()+1);i++)
    { int match=1;
      for(int j=0;j<b.length();j++)
      { if(a.charAt(i+j)!=b.charAt(j))
      {match=0;}}
     if(match==1)
     {
       count++;}}
    System.out.println(count);
     
  } 
}
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();}
      int a=sc.nextInt();
      int b=sc.nextInt();
      for(int i=0;i<n;i++)
      {if(arr[i]==a)
      {System.out.println(i);
       break;}
       else if(i==(n-1))
         System.out.println("-1");
      }
      for(int i=0;i<n;i++)
      {if(arr[i]==b){
        System.out.println(i);
      break;}
      else if(i==(n-1))
         System.out.println("-1");}
    }
}
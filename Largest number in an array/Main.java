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
      int max=0;
      for(int i=0;i<n;i++)
      {
        if(arr[i]>max)
          max=arr[i];
      }
      System.out.println(max);
    }
}
import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      // Type your code here
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();}
      int value=sc.nextInt();
      method(n,arr,value);}
  public static void method(int n,int arr[],int value)
  { for(int i=0;i<n;i++)
  {for(int j=i+1;j<n;j++)
  { int sum=0;
    sum=arr[i]+arr[j];
if(sum==value)
  System.out.println(arr[i]+","+" "+arr[j]);
    }
   //System.out.println();
  }
}
}
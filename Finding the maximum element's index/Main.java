import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
     Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int list[] = new int[n];
for(int index = 0; index < n; index++)
{
list[index] = sc.nextInt();
}
    int max=0;
   for(int i=0;i<n-1;i++)
   {
     if(list[max]<list[i+1])
                     {max=i+1;}}
    System.out.println(max);
                       
  }
}
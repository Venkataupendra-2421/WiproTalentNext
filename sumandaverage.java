import java.util.*;
class sumandaverage{
 public static void main(String args[]){
    int n;
        Scanner sc=new Scanner(System.in);
  System.out.println("Enter the size of an array");
  n=sc.nextInt();
  int a[]=new int[n];

  System.out.println("Enter the elements of an array");

  for(int i=0;i<n;++i){
   a[i]=sc.nextInt();}
   int sum=0;
  for(int i=0;i<n;i++){
   sum += a[i];}
     double avg= sum/n;
System.out.println("Sum of an array is:"+sum);

  System.out.println("Average of an array is:"+avg);
}}
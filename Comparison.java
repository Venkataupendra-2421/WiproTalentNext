import java.util.*;

class Comparison {
  public static void main(String args[]) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of an array");
    n = sc.nextInt();
    int a[] = new int[n];

    System.out.println("Enter the elements of an array");

    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int max = a[0];
    int min = a[0];


    if (n == 1) {
      System.out.println("Maximum of an array is: " + max);
      System.out.println("Minimum of an array is: " + min);
    } else {
      for (int i = 1; i < n; i++) {
        if (a[i] > max) {
          max = a[i];
        }
        if (a[i] < min) {
          min = a[i];
        }
      }
      System.out.println("Maximum of an array is: " + max);
      System.out.println("Minimum of an array is: " + min);
    }
  }
}
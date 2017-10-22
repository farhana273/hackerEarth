import java.util.*;
public class product
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int M = 1000000007;
    long [] array = new long[n];
    long product = 1;
    for(int i = 0;i < n; i++)
    {
      array[i] = sc.nextInt();
    }
     for(int i = 0;i < n; i++)
    {
      product = (array[i]*product)%M;
    }
     System.out.println(product);
  }
}
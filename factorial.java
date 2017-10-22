import java.util.*;
public class factorial
{
  public static void main(String[]args)
  {
   Scanner sc = new Scanner(System.in);
   int i = sc.nextInt();
   int product = 1;
   for(int j = 1; j <= i ; j++)
   {
    product = product * j;
   }
   System.out.println(product);
  }
}
import java.util.*;
public class primeNumberFinder
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String output = "";
    boolean result = false;
    if(n<1||n>1000)
    {
      return;
    }
    for(int i = 2; i <n ;i++)
    {
      result = false;
      for(int j =2 ; j <i;j++)
      {
       if(i%j==0)
       {
         result = true;
         break;
       }
      }
      if(!result)
      {
        output = output + i + " ";
      }
     
    }
    System.out.println(output);
  }
}
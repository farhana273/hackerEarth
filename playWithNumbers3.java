import java.util.*;
import java.io.*;
public class playWithNumbers3
{
  public static void main(String[]args)throws Exception
  {
     HashMap<String,Long> hm=new HashMap<String,Long>();
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long [] array = new long[n];
    int q = sc.nextInt();
    array[0] =sc.nextLong();
    for(int i = 1; i < n;i++)
    {
      array[i] = array[i-1] + sc.nextLong();
      
    }
    for(int i = 0; i < q;i++)
    {
      
      int s =sc.nextInt()-1;
      int e =sc.nextInt()-1;
      long sum = 0;
      long div = e - s + 1;
      
      if(s==0)
      {
        sum = array[e];
      }
      else
      {
        sum = array[e] - array[s-1];
      }
     
      System.out.println(sum/div);
    }
  }
}

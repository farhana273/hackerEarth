import java.util.*;
import java.io.*;
public class playWithNumbers
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
      
      for(int j = s; j <= e ;j++)
      {
        String key = s+""+j;
        if(hm.containsKey(key))
        {
           sum = hm.get(key); 
        }
        else{
        sum = sum + array[j];
        hm.put(key,sum);
        }
      }
     
      System.out.println(sum/div);
    }
  }
}

import java.util.*;
public class Divisor
{
  public static void main(String[]args)
  {
   Scanner sc = new Scanner(System.in);
   String s = sc.nextLine();
   StringTokenizer st = new StringTokenizer(s," ");
   int l = Integer.parseInt(st.nextToken());
   int r = Integer.parseInt(st.nextToken());
   int k = Integer.parseInt(st.nextToken());
   int count = 0;
   for (int i = l; i <= r ; i++)
   {
     if(i%k ==0)
     {
       count++;
     }
   }
   System.out.println(count);
  }
}
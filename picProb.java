import java.util.*;
public class picProb
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    if(l<1||l>10000)
    {
      return;
    }
     int n = sc.nextInt();
    if(n<1||n>1000)
    {
      return;
    }
    for(int i = 0; i < n; i++)
    {
       int w = sc.nextInt();
    if(w<1||w>10000)
    {
      break;
    }
     int h = sc.nextInt();
    if(h<1||h>10000)
    {
     break;
    }
    if(w<l||h<l)
    {
      System.out.println("UPLOAD ANOTHER");
      
    }
    else{
    if(w==h)
    {
      System.out.println("ACCEPTED");
    }
    else
    {
      System.out.println("CROP IT");
    }
    }
    }
  }
}
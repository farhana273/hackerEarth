import java.util.*;
public class permutations
{
  public static void main(String[]args)
  {
    Scanner sc = new Scanner(System.in);
    int  testCases = sc.nextInt();
    int count = 0;
    for(int j = 0; j < testCases ; j++)
    {
      count = 0;
      String a = sc.next();
      String b = sc.next();
      char [] array1 = a.toCharArray();
      char [] array2 = b.toCharArray();
      boolean res = false;
      for(int k = 0; k< array1.length; k++)
      {
         res = false;
         for(int l = 0; l< array2.length; l++)
      {
        if(array1[k]==array2[l])
        {
         res = true;
         array2[l]='0';
         break;
        }
      }
         if(!res)
         {
           System.out.println("NO");
           break;
         }
        
      }
         if(res)
         {
           System.out.println("YES");
           
         }
      
      
    }
    
  }
}
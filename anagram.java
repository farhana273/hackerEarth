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
      for(int k = 0; k< array1.length; k++)
      {
         for(int l = 0; l< array2.length; l++)
      {
        if(array1[k]==array2[l])
        {
          array2[l] = '0';
          array1[k] = '0';
          break;
        }
      }
      }
      for(int k = 0; k< array1.length; k++)
      {
        if(array1[k]!='0')
        {
          count++;
        }
      }
       for(int k = 0; k< array2.length; k++)
      {
        if(array2[k]!='0')
        {
          count++;
        }
      }
       if(count > 0)
       {
      System.out.println("NO");
       }
       else{
         System.out.println("YES");
       }
    }
    
  }
}